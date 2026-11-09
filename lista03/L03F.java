package lista03;

import java.util.Scanner;
public class L03F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        double base = in.nextDouble();
        System.out.print("Expoente (inteiro >= 0): ");
        int e = in.nextInt();
        double r = 1;
        int i = 1;
        while (i <= e) { r *= base; i++; }
        System.out.println(base + "^" + e + " = " + r);
    }
}
