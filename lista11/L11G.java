package lista11;

import java.util.Scanner;
public class L11G {
    static void porValor(double cotacao, double dolares) { System.out.printf("[valor] R$ %.2f%n", cotacao * dolares); }
    static void porReferencia(double cotacao, double dolares, double[] r) { r[0] = cotacao * dolares; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cotação do dólar: ");
        double cot = in.nextDouble();
        System.out.print("Quantidade de dólares: ");
        double usd = in.nextDouble();
        porValor(cot, usd);
        double[] r = new double[1];
        porReferencia(cot, usd, r);
        System.out.printf("[referência] R$ %.2f%n", r[0]);
    }
}
