package lista11;

import java.util.Scanner;
public class L11J {
    static void porValor(int n) {
        double f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        System.out.println("[valor] " + n + "! = " + f);
    }
    static void porReferencia(int n, double[] r) {
        r[0] = 1;
        for (int i = 2; i <= n; i++) r[0] *= i;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número: ");
        int n = in.nextInt();
        porValor(n);
        double[] r = new double[1];
        porReferencia(n, r);
        System.out.println("[referência] " + n + "! = " + r[0]);
    }
}
