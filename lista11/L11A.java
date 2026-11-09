package lista11;

import java.util.Scanner;
public class L11A {
    static void porValor(double valor, double taxa, double tempo) {
        System.out.printf("[valor] Prestação: %.2f%n", valor + (valor * (taxa / 100) * tempo));
    }
    static void porReferencia(double valor, double taxa, double tempo, double[] r) {
        r[0] = valor + (valor * (taxa / 100) * tempo);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor, taxa(%) e tempo: ");
        double v = in.nextDouble(), tx = in.nextDouble(), t = in.nextDouble();
        porValor(v, tx, t);
        double[] r = new double[1];
        porReferencia(v, tx, t, r);
        System.out.printf("[referência] Prestação: %.2f%n", r[0]);
    }
}
