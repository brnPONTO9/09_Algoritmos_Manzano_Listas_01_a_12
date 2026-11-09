package lista03;

import java.util.Scanner;
public class L03I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        int i = 1;
        while (i <= 10) {
            System.out.print("Valor " + i + ": ");
            soma += in.nextDouble();
            i++;
        }
        System.out.println("Soma: " + soma + " | Média: " + soma / 10);
    }
}
