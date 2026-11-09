package lista01;

import java.util.Scanner;
public class Extra1A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quatro inteiros A B C D: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int p = a * c; // produto do primeiro com o terceiro
        int s = b + d; // soma do segundo com o quarto
        System.out.println("P = " + p + " | S = " + s);
    }
}
