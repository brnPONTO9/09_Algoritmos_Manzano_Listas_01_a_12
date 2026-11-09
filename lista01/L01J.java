package lista01;

import java.util.Scanner;
public class L01J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cotação do dólar (R$): ");
        double cotacao = in.nextDouble();
        System.out.print("Quantidade de dólares: ");
        double usd = in.nextDouble();
        System.out.printf("Valor em reais: R$ %.2f%n", usd * cotacao);
    }
}
