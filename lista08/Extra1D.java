package lista08;

import java.util.Scanner;
public class Extra1D {
    static int[][] ler(Scanner in, String nome, int divisor) {
        int[][] m = new int[5][5];
        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) {
            int v;
            do { System.out.print(nome + "[" + (i + 1) + "," + (j + 1) + "] (não divisível por " + divisor + "): "); v = in.nextInt(); } while (v % divisor == 0);
            m[i][j] = v;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = ler(in, "A", 3), b = ler(in, "B", 6), c = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { c[i][j] = a[i][j] + b[i][j]; System.out.print(c[i][j] + "\t"); }
            System.out.println();
        }
    }
}
