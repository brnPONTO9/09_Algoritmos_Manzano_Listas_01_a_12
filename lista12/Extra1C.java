package lista12;

import java.util.Scanner;
public class Extra1C {
    static double realParaDolar(double cotacao, double reais) { return reais / cotacao; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cotação do dólar (R$): ");
        double cot = in.nextDouble();
        System.out.print("Quantidade de reais: ");
        double reais = in.nextDouble();
        System.out.printf("Valor em dólares: US$ %.2f%n", realParaDolar(cot, reais));
    }
}
