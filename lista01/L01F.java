package lista01;

import java.util.Scanner;
public class L01F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor A: ");
        String a = in.nextLine();
        System.out.print("Valor B: ");
        String b = in.nextLine(); // texto serve para inteiro, real ou caractere
        String aux = a;
        a = b;
        b = aux;
        System.out.println("A = " + a + " | B = " + b);
    }
}
