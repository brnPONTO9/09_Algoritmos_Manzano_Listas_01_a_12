package lista10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/** Agenda de 10 pessoas – top-down: procedimentos + escolha...caso (switch). */
public class L10_1 {
    record Contato(String nome, String endereco, String telefone) { }
    static final Scanner in = new Scanner(System.in);
    static final Contato[] agenda = new Contato[10];
    static boolean cadastrado = false;

    static int menu() {
        System.out.println("\n1-Cadastrar 2-Pesquisar 3-Classificar 4-Apresentar 5-Sair");
        System.out.print("Opção: ");
        return Integer.parseInt(in.nextLine().trim());
    }
    static void cadastrar() {
        for (int i = 0; i < agenda.length; i++) {
            System.out.print("Nome " + (i + 1) + ": "); String n = in.nextLine();
            System.out.print("Endereço: "); String e = in.nextLine();
            System.out.print("Telefone: "); String t = in.nextLine();
            agenda[i] = new Contato(n, e, t);
        }
        cadastrado = true;
    }
    static void pesquisar() {
        System.out.print("Nome a pesquisar: ");
        String busca = in.nextLine();
        for (Contato c : agenda) if (c.nome().equalsIgnoreCase(busca)) { System.out.println(c); return; }
        System.out.println("Não encontrado.");
    }
    static void classificar() {
        Arrays.sort(agenda, Comparator.comparing(Contato::nome, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Classificado por nome.");
    }
    static void apresentar() { for (Contato c : agenda) System.out.println(c); }

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu();
            if (opcao >= 2 && opcao <= 4 && !cadastrado) { System.out.println("Cadastre primeiro (opção 1)."); continue; }
            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> pesquisar();
                case 3 -> classificar();
                case 4 -> apresentar();
                case 5 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }
}
