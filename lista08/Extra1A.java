package lista08;

import java.util.Scanner;
public class Extra1A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[12], b = new int[12];
        double[][] c = new double[12][2];
        for (int i = 0; i < 12; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); }
        for (int i = 0; i < 12; i++) { System.out.print("B[" + (i + 1) + "]: "); b[i] = in.nextInt(); }
        for (int i = 0; i < 12; i++) { c[i][0] = a[i] * 2; c[i][1] = b[i] - 5; System.out.println(c[i][0] + "\t" + c[i][1]); }
    }
}
