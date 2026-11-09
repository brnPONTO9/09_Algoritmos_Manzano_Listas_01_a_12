package lista12;

import java.util.Scanner;
public class Extra1A {
    static int somatorio(int n) { int s = 0; for (int i = 1; i <= n; i++) s += i; return s; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        System.out.println("Soma 1..N: " + somatorio(in.nextInt()));
    }
}
