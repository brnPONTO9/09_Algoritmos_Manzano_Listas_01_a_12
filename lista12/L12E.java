package lista12;

import java.util.Scanner;
public class L12E {
    static double dolarParaReal(double cotacao, double dolares) { return cotacao * dolares; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cotação do dólar: ");
        double cot = in.nextDouble();
        System.out.print("Quantidade de dólares: ");
        double usd = in.nextDouble();
        System.out.printf("Valor em reais: R$ %.2f%n", dolarParaReal(cot, usd));
    }
}
