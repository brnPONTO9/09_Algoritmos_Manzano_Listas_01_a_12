package lista08;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[4][5];
        int[] b = new int[4], c = new int[5];
        for (int i = 0; i < 4; i++) for (int j = 0; j < 5; j++) {
            System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: ");
            a[i][j] = in.nextInt();
            b[i] += a[i][j];
            c[j] += a[i][j];
        }
        int total = Arrays.stream(b).sum() + Arrays.stream(c).sum();
        System.out.println("B (linhas) = " + Arrays.toString(b) + " | C (colunas) = " + Arrays.toString(c));
        System.out.println("Somatório de B + somatório de C: " + total);
    }
}
