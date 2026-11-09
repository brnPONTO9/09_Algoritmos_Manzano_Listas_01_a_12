package lista12;

import java.util.Scanner;
public class L12D {
    static double quadradoDaSoma(double a, double b, double c) { double s = a + b + c; return s * s; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A B C: ");
        System.out.println("Quadrado da soma: " + quadradoDaSoma(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}
