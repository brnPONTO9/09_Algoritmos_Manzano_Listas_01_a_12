package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[15], b = new int[15];
        for (int i = 0; i < 15; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); b[i] = a[i] * a[i]; }
        System.out.println("A = " + Arrays.toString(a));
        System.out.println("B = " + Arrays.toString(b));
    }
}
