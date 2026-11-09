package lista07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class L07A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] v = new Integer[12];
        for (int i = 0; i < 12; i++) { System.out.print("Elemento " + (i + 1) + ": "); v[i] = in.nextInt(); }
        Arrays.sort(v, Collections.reverseOrder());
        System.out.println("Decrescente: " + Arrays.toString(v));
    }
}
