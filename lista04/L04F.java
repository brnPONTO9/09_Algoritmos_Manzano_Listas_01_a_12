package lista04;

import java.util.Scanner;
public class L04F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        int qtd = 0;
        double v;
        do {
            System.out.print("Valor (negativo encerra): ");
            v = in.nextDouble();
            if (v >= 0) { soma += v; qtd++; }
        } while (v >= 0);
        System.out.println("Total: " + soma + " | Quantidade: " + qtd);
        System.out.println(qtd > 0 ? "Média: " + soma / qtd : "Sem valores para calcular a média");
    }
}
