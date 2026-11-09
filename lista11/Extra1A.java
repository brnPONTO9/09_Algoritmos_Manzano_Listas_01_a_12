package lista11;

import java.util.Scanner;
public class Extra1A {
    static void porValor(double c) { System.out.println("[valor] Fahrenheit: " + (9 * c + 160) / 5); }
    static void porReferencia(double c, double[] r) { r[0] = (9 * c + 160) / 5; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = in.nextDouble();
        porValor(c);
        double[] r = new double[1];
        porReferencia(c, r);
        System.out.println("[referência] Fahrenheit: " + r[0]);
    }
}
