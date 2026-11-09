package lista04;

import java.util.Scanner;
public class L04H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        String resp;
        do {
            System.out.print("Nome do cômodo: ");
            String nome = in.nextLine();
            System.out.print("Largura: ");
            double largura = in.nextDouble();
            System.out.print("Comprimento: ");
            double comprimento = in.nextDouble();
            in.nextLine();
            double area = largura * comprimento;
            total += area;
            System.out.println("Área de " + nome + ": " + area);
            System.out.print("Continuar (SIM/NAO)? ");
            resp = in.nextLine().trim();
        } while (!resp.equalsIgnoreCase("NAO") && !resp.equalsIgnoreCase("NÃO"));
        System.out.println("Área total da residência: " + total);
    }
}
