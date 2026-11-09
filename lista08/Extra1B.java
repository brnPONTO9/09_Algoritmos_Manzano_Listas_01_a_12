package lista08;

import java.util.Scanner;
public class Extra1B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[8][6];
        int[] b = new int[8];
        int total = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) { System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: "); a[i][j] = in.nextInt(); b[i] += a[i][j]; }
            total += b[i];
        }
        System.out.println("Soma de cada linha (B): " + java.util.Arrays.toString(b));
        System.out.println("Somatório dos elementos de B: " + total);
    }
}
