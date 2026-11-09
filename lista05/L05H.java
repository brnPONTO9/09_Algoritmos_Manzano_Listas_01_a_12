package lista05;

import java.util.Scanner;
public class L05H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        double b = in.nextDouble();
        System.out.print("Expoente (inteiro >= 0): ");
        int e = in.nextInt();
        double r = 1;
        for (int i = 0; i < e; i++) r *= b;
        System.out.println(b + "^" + e + " = " + r);
    }
}
