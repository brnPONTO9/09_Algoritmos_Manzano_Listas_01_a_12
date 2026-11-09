package lista07;

import java.util.Arrays;
import java.util.Scanner;
public class L07B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[8], b = new int[8];
        for (int i = 0; i < 8; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); b[i] = a[i] * 5; }
        System.out.println("B = " + Arrays.toString(b));
        System.out.print("Valor a pesquisar em B: ");
        int alvo = in.nextInt();
        int pos = -1;
        for (int i = 0; i < b.length; i++) if (b[i] == alvo) { pos = i; break; } // pesquisa sequencial
        System.out.println(pos >= 0 ? "Encontrado na posição " + (pos + 1) : "Não encontrado");
    }
}
