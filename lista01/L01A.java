package lista01;

import java.util.Scanner;
public class L01A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double c = in.nextDouble();
        System.out.println("Fahrenheit: " + (9 * c + 160) / 5);
    }
}
