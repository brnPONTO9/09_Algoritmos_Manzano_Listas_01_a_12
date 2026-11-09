package lista01;

import java.util.Scanner;
public class L01B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        double f = in.nextDouble();
        System.out.println("Celsius: " + (f - 32) * (5.0 / 9));
    }
}
