package lista02;

import java.util.Scanner;
public class L02K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inteiro: ");
        int n = in.nextInt();
        if (!(n > 3)) System.out.println(n);
    }
}
