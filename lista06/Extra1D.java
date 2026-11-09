package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[20];
        for (int i = 0; i < 20; i++) { System.out.print("Nome " + (i + 1) + ": "); nomes[i] = in.nextLine().trim(); }
        Arrays.sort(nomes, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Em ordem alfabética:");
        for (String n : nomes) System.out.println(n);
        System.out.print("Nome para pesquisar: ");
        String busca = in.nextLine().trim();
        int idx = -1;
        for (int i = 0; i < nomes.length; i++) if (nomes[i].equalsIgnoreCase(busca)) { idx = i; break; }
        System.out.println(idx >= 0 ? "Encontrado no índice " + idx + " (posição " + (idx + 1) + ")" : "Nome não encontrado");
    }
}
