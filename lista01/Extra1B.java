package lista01;

import java.util.Scanner;
public class Extra1B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Salário mensal (SM): ");
        double sm = in.nextDouble();
        System.out.print("Percentual de reajuste (PR): ");
        double pr = in.nextDouble();
        System.out.printf("Novo salário (NS): %.2f%n", sm + sm * pr / 100);
    }
}
