package lista11;

import java.util.Scanner;
public class Extra1D {
    static double calcular(int qtdA, int qtdB) {
        double total = qtdA * 10.0 + qtdB * 20.0;
        double desconto = (qtdA > 0 && qtdB > 0) ? 0.15 : (qtdA > 0 || qtdB > 0) ? 0.10 : 0;
        return total - total * desconto;
    }
    static void porValor(int qtdA, int qtdB) { System.out.printf("[valor] Despesa: R$ %.2f%n", calcular(qtdA, qtdB)); }
    static void porReferencia(int qtdA, int qtdB, double[] r) { r[0] = calcular(qtdA, qtdB); }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Unidades do produto A (R$ 10,00): ");
        int a = in.nextInt();
        System.out.print("Unidades do produto B (R$ 20,00): ");
        int b = in.nextInt();
        porValor(a, b);
        double[] r = new double[1];
        porReferencia(a, b, r);
        System.out.printf("[referência] Despesa: R$ %.2f%n", r[0]);
    }
}
