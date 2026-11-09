package lista02;

import java.util.Scanner;
public class L02A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dois inteiros: ");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Diferença do maior pelo menor: " + (Math.max(a, b) - Math.min(a, b)));
    }
}
