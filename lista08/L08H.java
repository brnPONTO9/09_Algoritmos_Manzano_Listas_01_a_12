package lista08;

import java.util.Scanner;
public class L08H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0, impares = 0, total = 10 * 7;
        for (int i = 0; i < 10; i++) for (int j = 0; j < 7; j++) {
            System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: ");
            if (in.nextInt() % 2 == 0) pares++; else impares++;
        }
        System.out.printf("Pares: %d (%.1f%%) | Ímpares: %d (%.1f%%)%n", pares, pares * 100.0 / total, impares, impares * 100.0 / total);
    }
}
