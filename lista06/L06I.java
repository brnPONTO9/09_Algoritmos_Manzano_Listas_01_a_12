package lista06;

import java.util.Scanner;
public class L06I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] a = new double[15], b = new double[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + (i + 1) + "]: ");
            a[i] = in.nextDouble();
            // índice par (1-based, como no algoritmo): dividido por 2; ímpar: multiplicado por 1,5
            b[i] = ((i + 1) % 2 == 0) ? a[i] / 2 : a[i] * 1.5;
        }
        System.out.println("A\tB");
        for (int i = 0; i < 15; i++) System.out.println(a[i] + "\t" + b[i]);
    }
}
