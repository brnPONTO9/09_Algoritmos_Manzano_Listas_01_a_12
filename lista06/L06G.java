package lista06;

import java.util.Scanner;
public class L06G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[20], b = new int[20];
        for (int i = 0; i < 20; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); }
        for (int i = 0; i < 20; i++) b[19 - i] = a[i]; // primeiro de A é o último de B
        System.out.println("A\tB");
        for (int i = 0; i < 20; i++) System.out.println(a[i] + "\t" + b[i]);
    }
}
