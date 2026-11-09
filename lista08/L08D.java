package lista08;

import java.util.Scanner;
public class L08D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        double[][] c = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i + 1) + "] (0 a 170): ");
            a[i] = in.nextInt();
            double fat = 1; // fatorial de zero é 1
            for (int k = 2; k <= a[i]; k++) fat *= k;
            c[i][0] = a[i] + 5; c[i][1] = fat; c[i][2] = (double) a[i] * a[i];
        }
        System.out.println("A+5\tfatorial\tquadrado");
        for (double[] l : c) System.out.println(l[0] + "\t" + l[1] + "\t" + l[2]);
    }
}
