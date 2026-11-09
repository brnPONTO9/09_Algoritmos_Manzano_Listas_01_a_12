package lista11;

import java.util.Scanner;
public class L11D {
    static void porValor(double base, int exp) {
        double r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        System.out.println("[valor] " + base + "^" + exp + " = " + r);
    }
    static void porReferencia(double base, int exp, double[] r) {
        r[0] = 1;
        for (int i = 0; i < exp; i++) r[0] *= base;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base e expoente: ");
        double b = in.nextDouble();
        int e = in.nextInt();
        porValor(b, e);
        double[] r = new double[1];
        porReferencia(b, e, r);
        System.out.println("[referência] resultado = " + r[0]);
    }
}
