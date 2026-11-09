package lista08;

import java.util.Scanner;
public class L08B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[7], b = new int[7];
        int[][] c = new int[7][2];
        for (int i = 0; i < 7; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); }
        for (int i = 0; i < 7; i++) { System.out.print("B[" + (i + 1) + "]: "); b[i] = in.nextInt(); }
        for (int i = 0; i < 7; i++) { c[i][0] = a[i]; c[i][1] = b[i]; System.out.println(c[i][0] + "\t" + c[i][1]); }
    }
}
