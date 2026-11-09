package lista11;

import java.util.Scanner;
public class L11E {
    static void porValor(int n) { System.out.println("[valor] " + n + (n % 2 == 0 ? " é PAR" : " é ÍMPAR")); }
    static void porReferencia(int n, String[] r) { r[0] = n % 2 == 0 ? "PAR" : "ÍMPAR"; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inteiro: ");
        int n = in.nextInt();
        porValor(n);
        String[] r = new String[1];
        porReferencia(n, r);
        System.out.println("[referência] " + n + " é " + r[0]);
    }
}
