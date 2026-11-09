package lista03;

import java.util.Scanner;
public class L03A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número: ");
        int n = in.nextInt();
        int i = 1;
        while (i <= 10) { System.out.println(n + " x " + i + " = " + n * i); i++; }
    }
}
