package lista04;

import java.util.Scanner;
public class L04I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, lidos = 0, n;
        do {
            System.out.print("Inteiro positivo (negativo encerra): ");
            n = in.nextInt();
            if (n >= 0) { lidos++; maior = Math.max(maior, n); menor = Math.min(menor, n); }
        } while (n >= 0);
        System.out.println(lidos > 0 ? "Maior: " + maior + " | Menor: " + menor : "Nenhum valor positivo informado.");
    }
}
