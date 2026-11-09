package lista06;

import java.util.Scanner;
public class L06A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < 10; i++) { System.out.print("Elemento " + (i + 1) + ": "); v[i] = in.nextInt(); }
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }
}
