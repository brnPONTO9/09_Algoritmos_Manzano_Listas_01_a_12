package lista12;

import java.util.Scanner;
public class L12F {
    static double fahrenheitParaCelsius(double f) { return (f - 32) * (5.0 / 9); }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        System.out.printf("Celsius: %.2f%n", fahrenheitParaCelsius(in.nextDouble()));
    }
}
