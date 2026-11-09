package lista08;

import java.util.Scanner;
public class L08F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[][] a = new long[7][7], b = new long[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: ");
                a[i][j] = in.nextInt();
                boolean diagImpar = (i == j) && ((i + 1) % 2 != 0); // B[1,1], B[3,3], B[5,5], B[7,7]
                if (diagImpar) { long f = 1; for (int k = 2; k <= a[i][j]; k++) f *= k; b[i][j] = f; }
                else b[i][j] = a[i][j] + (i + 1) + (j + 1);
            }
        }
        System.out.println("A | B");
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 7; j++) sb.append(a[i][j]).append('\t');
            sb.append("| ");
            for (int j = 0; j < 7; j++) sb.append(b[i][j]).append('\t');
            System.out.println(sb);
        }
    }
}
