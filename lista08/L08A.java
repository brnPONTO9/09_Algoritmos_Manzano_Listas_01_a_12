package lista08;

import java.util.Scanner;
public class L08A {
    static int[][] ler(Scanner in, String nome, int l, int c) {
        int[][] m = new int[l][c];
        for (int i = 0; i < l; i++) for (int j = 0; j < c; j++) { System.out.print(nome + "[" + (i + 1) + "," + (j + 1) + "]: "); m[i][j] = in.nextInt(); }
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = ler(in, "A", 5, 3), b = ler(in, "B", 5, 3), c = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) { c[i][j] = a[i][j] + b[i][j]; System.out.print(c[i][j] + "\t"); }
            System.out.println();
        }
    }
}
