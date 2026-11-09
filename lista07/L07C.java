package lista07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class L07C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] a = new Integer[15];
        Integer[] b = new Integer[15];
        for (int i = 0; i < 15; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); b[i] = a[i] / 2; } // parte inteira
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);
        System.out.println("A (decrescente): " + Arrays.toString(a));
        System.out.println("B (crescente):   " + Arrays.toString(b));
    }
}
