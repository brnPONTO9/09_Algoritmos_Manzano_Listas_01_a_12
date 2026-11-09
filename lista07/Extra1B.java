package lista07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Extra1B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        Integer[] b = new Integer[20];
        for (int i = 0; i < 20; i++) {
            do { System.out.print("A[" + (i + 1) + "] (negativo): "); a[i] = in.nextInt(); } while (a[i] >= 0);
            b[i] = Math.abs(a[i]);
        }
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("B (decrescente): " + Arrays.toString(b));
    }
}
