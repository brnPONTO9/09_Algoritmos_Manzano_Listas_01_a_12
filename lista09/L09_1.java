package lista09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** Agenda de 10 pessoas com registro (record) e menu de opções. */
public class L09_1 {
    record Contato(String nome, String endereco, String telefone) { }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Contato[] agenda = new Contato[10];
        boolean cadastrado = false;
        int opcao;
        do {
            System.out.println("\n1-Cadastrar 2-Pesquisar por nome 3-Classificar por nome 4-Apresentar todos 5-Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(in.nextLine().trim());
            if (opcao == 1) {
                for (int i = 0; i < agenda.length; i++) {
                    System.out.print("Nome " + (i + 1) + ": "); String n = in.nextLine();
                    System.out.print("Endereço: "); String e = in.nextLine();
                    System.out.print("Telefone: "); String t = in.nextLine();
                    agenda[i] = new Contato(n, e, t);
                }
                cadastrado = true;
            } else if (opcao >= 2 && opcao <= 4 && !cadastrado) {
                System.out.println("Cadastre os registros primeiro (opção 1).");
            } else if (opcao == 2) {
                System.out.print("Nome a pesquisar: ");
                String busca = in.nextLine();
                boolean achou = false;
                for (Contato c : agenda) // pesquisa sequencial
                    if (c.nome().equalsIgnoreCase(busca)) { System.out.println(c); achou = true; break; }
                if (!achou) System.out.println("Não encontrado.");
            } else if (opcao == 3) {
                Arrays.sort(agenda, Comparator.comparing(Contato::nome, String.CASE_INSENSITIVE_ORDER));
                System.out.println("Registros classificados por nome.");
            } else if (opcao == 4) {
                for (Contato c : agenda) System.out.println(c);
            } else if (opcao != 5) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}
