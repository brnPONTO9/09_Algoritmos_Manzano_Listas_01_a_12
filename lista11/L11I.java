package lista11;

import java.util.Scanner;
public class L11I {
    static void porValor(double n) { System.out.println("[valor] Positivo: " + Math.abs(n)); }
    static void porReferencia(double n, double[] r) { r[0] = n < 0 ? -n : n; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        double n = in.nextDouble();
        porValor(n);
        double[] r = new double[1];
        porReferencia(n, r);
        System.out.println("[referência] Positivo: " + r[0]);
    }
}
