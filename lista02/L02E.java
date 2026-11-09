package lista02;

import java.util.Scanner;
public class L02E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A, B e C: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        if (a == 0) { System.out.println("A deve ser diferente de zero: não é equação do 2º grau."); return; }
        double delta = b * b - 4 * a * c;
        if (delta < 0) System.out.println("Não há raízes reais (delta = " + delta + ")");
        else {
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
