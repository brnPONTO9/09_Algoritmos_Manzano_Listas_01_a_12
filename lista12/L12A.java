package lista12;

import java.util.Scanner;
public class L12A {
    static long fibonacci(int n) { // n-ésimo termo (1, 1, 2, 3, 5...)
        long a = 1, b = 1;
        for (int i = 3; i <= n; i++) { long c = a + b; a = b; b = c; }
        return n <= 0 ? 0 : b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de termos: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();
    }
}
