package lista12;

import java.util.Scanner;
public class L12B {
    static double prestacao(double valor, double taxa, double tempo) { return valor + (valor * (taxa / 100) * tempo); }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor, taxa(%) e tempo: ");
        System.out.printf("Prestação: %.2f%n", prestacao(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}
