package lista12;

import java.util.Scanner;
public class Extra1B {
    static double somaDosQuadrados(double a, double b, double c) { return a * a + b * b + c * c; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A B C: ");
        System.out.println("Soma dos quadrados: " + somaDosQuadrados(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}
