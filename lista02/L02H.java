package lista02;

import java.util.Scanner;
public class L02H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cinco inteiros: ");
        int maior = in.nextInt(), menor = maior;
        for (int i = 1; i < 5; i++) {
            int n = in.nextInt();
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }
}
