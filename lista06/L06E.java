package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[15], b = new int[15], c = new int[30];
        for (int i = 0; i < 15; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); }
        for (int i = 0; i < 15; i++) { System.out.print("B[" + (i + 1) + "]: "); b[i] = in.nextInt(); }
        for (int i = 0; i < 15; i++) { c[i] = a[i]; c[i + 15] = b[i]; }
        System.out.println("C = " + Arrays.toString(c));
    }
}
