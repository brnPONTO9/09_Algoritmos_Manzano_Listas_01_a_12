package lista01;

import java.util.Scanner;
public class L01G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quatro inteiros A B C D: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println("A+B=" + (a + b) + " A*B=" + (a * b));
        System.out.println("A+C=" + (a + c) + " A*C=" + (a * c));
        System.out.println("A+D=" + (a + d) + " A*D=" + (a * d));
        System.out.println("B+C=" + (b + c) + " B*C=" + (b * c));
        System.out.println("B+D=" + (b + d) + " B*D=" + (b * d));
        System.out.println("C+D=" + (c + d) + " C*D=" + (c * d));
    }
}
