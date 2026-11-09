package lista01;

import java.util.Scanner;
public class L01E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor da prestação: ");
        double valor = in.nextDouble();
        System.out.print("Taxa (%): ");
        double taxa = in.nextDouble();
        System.out.print("Tempo de atraso: ");
        double tempo = in.nextDouble();
        System.out.printf("Prestação em atraso: %.2f%n", valor + (valor * taxa / 100) * tempo);
    }
}
