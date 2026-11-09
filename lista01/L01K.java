package lista01;

import java.util.Scanner;
public class L01K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cotação do dólar (R$): ");
        double cotacao = in.nextDouble();
        System.out.print("Quantidade de reais: ");
        double reais = in.nextDouble();
        System.out.printf("Valor em dólares: US$ %.2f%n", reais / cotacao);
    }
}
