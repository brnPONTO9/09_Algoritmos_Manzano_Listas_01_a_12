package lista10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** 20 funcionários – top-down com procedimentos e switch. */
public class L10_4 {
    record Funcionario(int matricula, String nome, double salario) { }
    static final Scanner in = new Scanner(System.in);
    static final Funcionario[] f = new Funcionario[20];
    static boolean cadastrado = false;

    static int menu() {
        System.out.println("\n1-Cadastrar 2-Pesquisar matrícula 3-Salário > 1000 4-Salário < 1000 5-Salário = 1000 6-Sair");
        System.out.print("Opção: ");
        return Integer.parseInt(in.nextLine().trim());
    }
    static void cadastrar() {
        for (int i = 0; i < f.length; i++) {
            System.out.print("Matrícula " + (i + 1) + ": "); int m = Integer.parseInt(in.nextLine().trim());
            System.out.print("Nome: "); String n = in.nextLine();
            System.out.print("Salário: "); double s = Double.parseDouble(in.nextLine().replace(',', '.'));
            f[i] = new Funcionario(m, n, s);
        }
        Arrays.sort(f, Comparator.comparingInt(Funcionario::matricula));
        cadastrado = true;
    }
    static void pesquisar() {
        System.out.print("Matrícula: ");
        int m = Integer.parseInt(in.nextLine().trim());
        for (Funcionario x : f) if (x.matricula() == m) { System.out.println(x); return; }
        System.out.println("Não encontrado.");
    }
    static void listar(int modo) { // 1 = acima, 2 = abaixo, 3 = igual a 1000
        for (Funcionario x : f) {
            boolean ok = switch (modo) { case 1 -> x.salario() > 1000; case 2 -> x.salario() < 1000; default -> x.salario() == 1000; };
            if (ok) System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            if (opcao >= 2 && opcao <= 5 && !cadastrado) { System.out.println("Cadastre primeiro (opção 1)."); continue; }
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> pesquisar();
                case 3 -> listar(1);
                case 4 -> listar(2);
                case 5 -> listar(3);
                case 6 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
