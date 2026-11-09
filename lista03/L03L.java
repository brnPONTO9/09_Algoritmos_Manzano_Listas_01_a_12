package lista03;

import java.util.Scanner;
public class L03L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inteiro positivo (negativo encerra): ");
        int n = in.nextInt();
        if (n < 0) { System.out.println("Nenhum valor positivo informado."); return; }
        int maior = n, menor = n;
        while (n >= 0) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
            System.out.print("Inteiro positivo (negativo encerra): ");
            n = in.nextInt();
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }
}
