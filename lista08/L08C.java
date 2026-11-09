package lista08;

import java.util.Scanner;
public class L08C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[4][5];
        for (int i = 0; i < 4; i++) for (int j = 0; j < 5; j++) { System.out.print("M[" + (i + 1) + "," + (j + 1) + "]: "); m[i][j] = in.nextInt(); }
        for (int[] linha : m) { for (int x : linha) System.out.print(x + "\t"); System.out.println(); }
    }
}
