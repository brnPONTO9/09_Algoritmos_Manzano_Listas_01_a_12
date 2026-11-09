package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1A {
    interface Regra { boolean aceita(int n); }
    static int ler(Scanner in, String rotulo, Regra r) {
        while (true) {
            System.out.print(rotulo + ": ");
            int n = in.nextInt();
            if (r.aceita(n)) return n;
            System.out.println("Valor rejeitado pelo programa.");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[12], b = new int[12], c = new int[24];
        for (int i = 0; i < 12; i++) a[i] = ler(in, "A[" + (i + 1) + "] (divisível por 2 ou 3)", n -> n % 2 == 0 || n % 3 == 0);
        for (int i = 0; i < 12; i++) b[i] = ler(in, "B[" + (i + 1) + "] (não múltiplo de 5)", n -> n % 5 != 0);
        System.arraycopy(a, 0, c, 0, 12);
        System.arraycopy(b, 0, c, 12, 12);
        System.out.println("C = " + Arrays.toString(c));
    }
}
