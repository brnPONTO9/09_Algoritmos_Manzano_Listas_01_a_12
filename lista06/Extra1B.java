package lista06;

import java.util.Scanner;
public class Extra1B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[15];
        double[] b = new double[15]; // fatorial de 15 cabe em long, mas valores maiores só em double
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + (i + 1) + "] (0 a 170): ");
            a[i] = in.nextInt();
            double f = 1;
            for (int k = 2; k <= a[i]; k++) f *= k;
            b[i] = f;
        }
        for (int i = 0; i < 15; i++) System.out.println(a[i] + "! = " + b[i]);
    }
}
