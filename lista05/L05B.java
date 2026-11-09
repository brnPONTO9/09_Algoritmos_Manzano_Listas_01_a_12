package lista05;

import java.util.Scanner;
public class L05B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(n + " x " + i + " = " + n * i);
    }
}
