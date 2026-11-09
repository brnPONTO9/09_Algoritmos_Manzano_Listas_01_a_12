package lista10;

import java.util.Scanner;
import java.util.function.Predicate;
/** 15 pessoas (nome, altura) – top-down com procedimentos e switch. */
public class L10_3 {
    record Pessoa(String nome, double altura) { }
    static final Scanner in = new Scanner(System.in);
    static final Pessoa[] pessoas = new Pessoa[15];
    static boolean cadastrado = false;

    static int menu() {
        System.out.println("\n1-Cadastrar 2-<= 1,5 3-> 1,5 4-> 1,5 e < 2,0 5-Média 6-Sair");
        System.out.print("Opção: ");
        return Integer.parseInt(in.nextLine().trim());
    }
    static void cadastrar() {
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Nome " + (i + 1) + ": "); String n = in.nextLine();
            System.out.print("Altura (m): "); double h = Double.parseDouble(in.nextLine().replace(',', '.'));
            pessoas[i] = new Pessoa(n, h);
        }
        cadastrado = true;
    }
    static void listar(Predicate<Pessoa> filtro) {
        for (Pessoa p : pessoas) if (filtro.test(p)) System.out.println(p.nome() + " - " + p.altura());
    }
    static void media() {
        double soma = 0;
        for (Pessoa p : pessoas) soma += p.altura();
        System.out.printf("Média das alturas: %.2f m%n", soma / pessoas.length);
    }
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            if (opcao >= 2 && opcao <= 5 && !cadastrado) { System.out.println("Cadastre primeiro (opção 1)."); continue; }
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar(p -> p.altura() <= 1.5);
                case 3 -> listar(p -> p.altura() > 1.5);
                case 4 -> listar(p -> p.altura() > 1.5 && p.altura() < 2.0);
                case 5 -> media();
                case 6 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
