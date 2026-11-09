package lista08;

import java.util.Scanner;
public class L08G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0;
        for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) { System.out.print("A[" + (i + 1) + "," + (j + 1) + "]: "); if (in.nextInt() % 2 == 0) pares++; }
        System.out.println("Total de elementos pares: " + pares);
    }
}
