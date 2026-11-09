package lista11;

import java.util.Scanner;
public class L11C {
    static void porValor(int n) {
        StringBuilder sb = new StringBuilder();
        long a = 1, b = 1;
        for (int i = 0; i < n; i++) { sb.append(a).append(' '); long c = a + b; a = b; b = c; }
        System.out.println("[valor] Fibonacci: " + sb);
    }
    static void porReferencia(int n, long[] r) { // r deve ter tamanho n
        long a = 1, b = 1;
        for (int i = 0; i < n; i++) { r[i] = a; long c = a + b; a = b; b = c; }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de termos: ");
        int n = in.nextInt();
        porValor(n);
        long[] r = new long[n];
        porReferencia(n, r);
        System.out.println("[referência] Fibonacci: " + java.util.Arrays.toString(r));
    }
}
