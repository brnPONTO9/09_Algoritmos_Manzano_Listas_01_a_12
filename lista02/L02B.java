package lista02;

import java.util.Scanner;
public class L02B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        int n = in.nextInt();
        if (n < 0) n = n * -1;
        System.out.println("Módulo: " + n);
    }
}
