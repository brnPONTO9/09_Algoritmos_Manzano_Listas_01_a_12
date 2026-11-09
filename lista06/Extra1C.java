package lista06;

import java.util.Scanner;
public class Extra1C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] a = new double[5], b = new double[5];
        for (int i = 0; i < 5; i++) { System.out.print("Celsius " + (i + 1) + ": "); a[i] = in.nextDouble(); b[i] = (9 * a[i] + 160) / 5; }
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i < 5; i++) System.out.println(a[i] + "\t" + b[i]);
    }
}
