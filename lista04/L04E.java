package lista04;

import java.util.Scanner;
public class L04E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0; // fatoriais passam de long com 21!, por isso double
        int i = 1;
        do {
            System.out.print("Valor " + i + " (0 a 170): ");
            int n = in.nextInt();
            double fat = 1;
            for (int k = 2; k <= n; k++) fat *= k;
            soma += fat;
            i++;
        } while (i <= 15);
        System.out.println("Somatório dos fatoriais: " + soma);
    }
}
