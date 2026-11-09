package lista12;

import java.util.Scanner;
public class L12C {
    static double potencia(double base, int expoente) {
        double r = 1;
        for (int i = 0; i < expoente; i++) r *= base;
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base e expoente: ");
        System.out.println("Resultado: " + potencia(in.nextDouble(), in.nextInt())); // POTENCIA(2,3) = 8
    }
}
