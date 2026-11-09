package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[8], b = new int[8];
        for (int i = 0; i < 8; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); b[i] = a[i] * 3; }
        System.out.println("B = " + Arrays.toString(b));
    }
}
