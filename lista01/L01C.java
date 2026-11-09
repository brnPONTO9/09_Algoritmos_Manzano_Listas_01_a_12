package lista01;

import java.util.Scanner;
public class L01C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Raio: ");
        double raio = in.nextDouble();
        System.out.print("Altura: ");
        double altura = in.nextDouble();
        System.out.printf("Volume: %.2f%n", Math.PI * raio * raio * altura);
    }
}
