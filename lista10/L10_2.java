package lista10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** 20 alunos – top-down com procedimentos e switch. */
public class L10_2 {
    record Aluno(String nome, double[] notas) {
        double media() { return Arrays.stream(notas).average().orElse(0); }
        String situacao() { return media() >= 5 ? "Aprovado" : "Reprovado"; }
    }
    static final Scanner in = new Scanner(System.in);
    static final Aluno[] turma = new Aluno[20];
    static boolean cadastrado = false;

    static double lerDouble() { return Double.parseDouble(in.nextLine().replace(',', '.')); }
    static int menu() {
        System.out.println("\n1-Cadastrar 2-Pesquisar 3-Apresentar todos 4-Sair");
        System.out.print("Opção: ");
        return Integer.parseInt(in.nextLine().trim());
    }
    static void cadastrar() {
        for (int i = 0; i < turma.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            String nome = in.nextLine();
            double[] notas = new double[4];
            for (int b = 0; b < 4; b++) { System.out.print("Nota do bimestre " + (b + 1) + ": "); notas[b] = lerDouble(); }
            turma[i] = new Aluno(nome, notas);
        }
        Arrays.sort(turma, Comparator.comparing(Aluno::nome, String.CASE_INSENSITIVE_ORDER));
        cadastrado = true;
    }
    static void pesquisar() {
        System.out.print("Nome a pesquisar: ");
        String busca = in.nextLine();
        for (Aluno a : turma) if (a.nome().equalsIgnoreCase(busca)) { System.out.printf("%s - média %.2f - %s%n", a.nome(), a.media(), a.situacao()); return; }
        System.out.println("Não encontrado.");
    }
    static void apresentar() {
        for (Aluno a : turma) System.out.printf("%s %s - média %.2f - %s%n", a.nome(), Arrays.toString(a.notas()), a.media(), a.situacao());
    }
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            if ((opcao == 2 || opcao == 3) && !cadastrado) { System.out.println("Cadastre primeiro (opção 1)."); continue; }
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> pesquisar();
                case 3 -> apresentar();
                case 4 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
