package lista02;

import java.util.Scanner;
public class L02I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inteiro: ");
        int n = in.nextInt();
        System.out.println(n % 2 == 0 ? "PAR" : "ÍMPAR");
    }
}
