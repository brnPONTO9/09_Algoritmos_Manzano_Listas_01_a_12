package lista02;

import java.util.Arrays;
import java.util.Scanner;
public class L02F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A, B e C: ");
        double[] v = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
        Arrays.sort(v);
        System.out.println("Ordem crescente: " + v[0] + " " + v[1] + " " + v[2]);
    }
}
