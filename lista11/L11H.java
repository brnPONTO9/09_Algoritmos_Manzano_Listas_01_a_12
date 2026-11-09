package lista11;

import java.util.Scanner;
public class L11H {
    static void porValor(int n) { System.out.println(n % 2 == 0 && n % 3 == 0 ? "[valor] Este valor é divisível por 2 e 3" : "[valor] Valor inválido"); }
    static void porReferencia(int n, String[] r) { r[0] = n % 2 == 0 && n % 3 == 0 ? "Este valor é divisível por 2 e 3" : "Valor inválido"; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        int n = in.nextInt();
        porValor(n);
        String[] r = new String[1];
        porReferencia(n, r);
        System.out.println("[referência] " + r[0]);
    }
}
