package lista01;

import java.util.Scanner;
public class Extra1C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Votos válidos de A, B e C: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        System.out.print("Votos nulos: ");
        double nulos = in.nextDouble();
        System.out.print("Votos em branco: ");
        double brancos = in.nextDouble();
        double validos = a + b + c, total = validos + nulos + brancos;
        System.out.printf("Total de eleitores: %.0f%n", total);
        System.out.printf("Válidos: %.2f%% | A: %.2f%% | B: %.2f%% | C: %.2f%%%n", validos * 100 / total, a * 100 / total, b * 100 / total, c * 100 / total);
        System.out.printf("Nulos: %.2f%% | Em branco: %.2f%%%n", nulos * 100 / total, brancos * 100 / total);
    }
}
