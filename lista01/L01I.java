package lista01;

import java.util.Scanner;
public class L01I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inteiros A e B: ");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Quadrado da diferença: " + (a - b) * (a - b));
    }
}
