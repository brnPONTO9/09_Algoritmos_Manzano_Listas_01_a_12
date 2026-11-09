package lista06;

import java.util.Arrays;
import java.util.Scanner;
public class L06H {
    static int[] ler(Scanner in, String nome) {
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) { System.out.print(nome + "[" + (i + 1) + "]: "); v[i] = in.nextInt(); }
        return v;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = ler(in, "A"), b = ler(in, "B"), c = ler(in, "C"), d = new int[15];
        for (int i = 0; i < 5; i++) { d[i] = a[i]; d[i + 5] = b[i]; d[i + 10] = c[i]; }
        System.out.println("D = " + Arrays.toString(d));
    }
}
