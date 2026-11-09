package lista02;

import java.util.Scanner;
public class L02J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor (1 a 9): ");
        int n = in.nextInt();
        System.out.println(n >= 1 && n <= 9 ? "O valor está na faixa permitida" : "O valor está fora da faixa permitida");
    }
}
