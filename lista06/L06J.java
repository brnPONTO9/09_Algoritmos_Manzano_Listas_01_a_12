package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06J {
    static int lerValidado(Scanner in, String rotulo, boolean par) {
        while (true) {
            System.out.print(rotulo + " (" + (par ? "par" : "ímpar") + "): ");
            int n = in.nextInt();
            if ((n % 2 == 0) == par) return n;
            System.out.println("Valor rejeitado pelo programa.");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[6], b = new int[6], c = new int[12];
        for (int i = 0; i < 6; i++) a[i] = lerValidado(in, "A[" + (i + 1) + "]", true);
        for (int i = 0; i < 6; i++) b[i] = lerValidado(in, "B[" + (i + 1) + "]", false);
        for (int i = 0; i < 6; i++) { c[i] = a[i]; c[i + 6] = b[i]; }
        System.out.println("C = " + Arrays.toString(c));
    }
}
