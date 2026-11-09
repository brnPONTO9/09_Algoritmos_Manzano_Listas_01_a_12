package lista09;

import java.util.Scanner;
/** 15 pessoas com nome e altura. */
public class L09_3 {
    record Pessoa(String nome, double altura) { }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[15];
        boolean cadastrado = false;
        int opcao;
        do {
            System.out.println("\n1-Cadastrar 2-Altura <= 1,5 3-Altura > 1,5 4-Entre 1,5 e 2,0 (exclusive) 5-Média das alturas 6-Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(in.nextLine().trim());
            if (opcao == 1) {
                for (int i = 0; i < pessoas.length; i++) {
                    System.out.print("Nome " + (i + 1) + ": "); String n = in.nextLine();
                    System.out.print("Altura (m): "); double h = Double.parseDouble(in.nextLine().replace(',', '.'));
                    pessoas[i] = new Pessoa(n, h);
                }
                cadastrado = true;
            } else if (opcao >= 2 && opcao <= 5 && !cadastrado) {
                System.out.println("Cadastre os registros primeiro (opção 1).");
            } else if (opcao == 2) {
                for (Pessoa p : pessoas) if (p.altura() <= 1.5) System.out.println(p.nome() + " - " + p.altura());
            } else if (opcao == 3) {
                for (Pessoa p : pessoas) if (p.altura() > 1.5) System.out.println(p.nome() + " - " + p.altura());
            } else if (opcao == 4) {
                for (Pessoa p : pessoas) if (p.altura() > 1.5 && p.altura() < 2.0) System.out.println(p.nome() + " - " + p.altura());
            } else if (opcao == 5) {
                double soma = 0;
                for (Pessoa p : pessoas) soma += p.altura();
                System.out.printf("Média das alturas: %.2f m%n", soma / pessoas.length);
            } else if (opcao != 6) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
