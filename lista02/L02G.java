package lista02;

import java.util.Scanner;
public class L02G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quatro inteiros: ");
        boolean algum = false;
        for (int i = 0; i < 4; i++) {
            int n = in.nextInt();
            if (n % 2 == 0 && n % 3 == 0) { System.out.println(n + " é divisível por 2 e 3"); algum = true; }
        }
        if (!algum) System.out.println("Nenhum número divisível por 2 e 3");
    }
}
