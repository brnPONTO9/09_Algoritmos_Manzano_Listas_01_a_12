package lista09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** 20 alunos com nome e 4 notas bimestrais. */
public class L09_2 {
    record Aluno(String nome, double[] notas) {
        double media() { return Arrays.stream(notas).average().orElse(0); }
        String situacao() { return media() >= 5 ? "Aprovado" : "Reprovado"; }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno[] turma = new Aluno[20];
        boolean cadastrado = false;
        int opcao;
        do {
            System.out.println("\n1-Cadastrar 2-Pesquisar 3-Apresentar todos 4-Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(in.nextLine().trim());
            if (opcao == 1) {
                for (int i = 0; i < turma.length; i++) {
                    System.out.print("Nome do aluno " + (i + 1) + ": ");
                    String nome = in.nextLine();
                    double[] notas = new double[4];
                    for (int b = 0; b < 4; b++) { System.out.print("Nota do bimestre " + (b + 1) + ": "); notas[b] = Double.parseDouble(in.nextLine().replace(',', '.')); }
                    turma[i] = new Aluno(nome, notas);
                }
                Arrays.sort(turma, Comparator.comparing(Aluno::nome, String.CASE_INSENSITIVE_ORDER)); // classifica após o cadastro
                cadastrado = true;
            } else if ((opcao == 2 || opcao == 3) && !cadastrado) {
                System.out.println("Cadastre os registros primeiro (opção 1).");
            } else if (opcao == 2) {
                System.out.print("Nome a pesquisar: ");
                String busca = in.nextLine();
                boolean achou = false;
                for (Aluno a : turma)
                    if (a.nome().equalsIgnoreCase(busca)) { System.out.printf("%s - média %.2f - %s%n", a.nome(), a.media(), a.situacao()); achou = true; break; }
                if (!achou) System.out.println("Não encontrado.");
            } else if (opcao == 3) {
                for (Aluno a : turma) System.out.printf("%s %s - média %.2f - %s%n", a.nome(), Arrays.toString(a.notas()), a.media(), a.situacao());
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
