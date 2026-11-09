package lista09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** 20 funcionários: matrícula, nome e salário. */
public class L09_4 {
    record Funcionario(int matricula, String nome, double salario) { }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Funcionario[] f = new Funcionario[20];
        boolean cadastrado = false;
        int opcao;
        do {
            System.out.println("\n1-Cadastrar 2-Pesquisar por matrícula 3-Salário > 1000 4-Salário < 1000 5-Salário = 1000 6-Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(in.nextLine().trim());
            if (opcao == 1) {
                for (int i = 0; i < f.length; i++) {
                    System.out.print("Matrícula " + (i + 1) + ": "); int m = Integer.parseInt(in.nextLine().trim());
                    System.out.print("Nome: "); String n = in.nextLine();
                    System.out.print("Salário: "); double s = Double.parseDouble(in.nextLine().replace(',', '.'));
                    f[i] = new Funcionario(m, n, s);
                }
                Arrays.sort(f, Comparator.comparingInt(Funcionario::matricula)); // classifica por matrícula
                cadastrado = true;
            } else if (opcao >= 2 && opcao <= 5 && !cadastrado) {
                System.out.println("Cadastre os registros primeiro (opção 1).");
            } else if (opcao == 2) {
                System.out.print("Matrícula: ");
                int m = Integer.parseInt(in.nextLine().trim());
                boolean achou = false;
                for (Funcionario x : f) if (x.matricula() == m) { System.out.println(x); achou = true; break; }
                if (!achou) System.out.println("Não encontrado.");
            } else if (opcao >= 3 && opcao <= 5) {
                for (Funcionario x : f) { // já ordenado por matrícula
                    boolean mostra = opcao == 3 ? x.salario() > 1000 : opcao == 4 ? x.salario() < 1000 : x.salario() == 1000;
                    if (mostra) System.out.println(x);
                }
            } else if (opcao != 6) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}
