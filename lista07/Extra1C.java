package lista07;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] b = new long[30];
        for (int i = 0; i < 30; i++) { System.out.print("A[" + (i + 1) + "]: "); long x = in.nextLong(); b[i] = x * x * x; }
        System.out.println("B (cubos) = " + Arrays.toString(b));
        System.out.print("Valor a pesquisar em B: ");
        long alvo = in.nextLong();
        int pos = -1;
        for (int i = 0; i < b.length; i++) if (b[i] == alvo) { pos = i; break; }
        System.out.println(pos >= 0 ? "Encontrado na posição " + (pos + 1) : "Não encontrado");
    }
}
