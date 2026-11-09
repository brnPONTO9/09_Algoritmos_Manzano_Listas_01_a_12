package lista08;

import java.util.Scanner;
public class L08E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) { System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: "); a[i][j] = in.nextInt(); }
        int soma = 0;
        for (int i = 0; i < 10; i++) soma += a[i][i]; // diagonal principal
        System.out.println("Soma da diagonal principal: " + soma);
    }
}
