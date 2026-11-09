package lista11;

import java.util.Scanner;
public class L11B {
    static void porValor(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        System.out.println("[valor] Soma 1..N: " + soma);
    }
    static void porReferencia(int n, int[] r) {
        r[0] = 0;
        for (int i = 1; i <= n; i++) r[0] += i;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int n = in.nextInt();
        porValor(n);
        int[] r = new int[1];
        porReferencia(n, r);
        System.out.println("[referência] Soma 1..N: " + r[0]);
    }
}
