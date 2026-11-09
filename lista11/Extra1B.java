package lista11;

import java.util.Scanner;
public class Extra1B {
    static void porValor(double a, double b, double c) { System.out.println("[valor] Quadrado da soma: " + Math.pow(a + b + c, 2)); }
    static void porReferencia(double a, double b, double c, double[] r) { r[0] = Math.pow(a + b + c, 2); }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A B C: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        porValor(a, b, c);
        double[] r = new double[1];
        porReferencia(a, b, c, r);
        System.out.println("[referência] Quadrado da soma: " + r[0]);
    }
}
