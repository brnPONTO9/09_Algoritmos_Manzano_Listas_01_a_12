package lista01;

import java.util.Scanner;
public class L01L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valores A B C: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        System.out.println("Soma dos quadrados: " + (a * a + b * b + c * c));
    }
}
