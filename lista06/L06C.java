package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[20], b = new int[20], c = new int[20];
        for (int i = 0; i < 20; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); }
        for (int i = 0; i < 20; i++) { System.out.print("B[" + (i + 1) + "]: "); b[i] = in.nextInt(); c[i] = a[i] - b[i]; }
        System.out.println("C = " + Arrays.toString(c));
    }
}
