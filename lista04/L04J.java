package lista04;

import java.util.Scanner;
public class L04J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dividendo: ");
        int dividendo = in.nextInt();
        System.out.print("Divisor (positivo): ");
        int divisor = in.nextInt();
        if (divisor <= 0 || dividendo < 0) { System.out.println("Use dividendo >= 0 e divisor > 0."); return; }
        int quociente = 0, resto = dividendo;
        while (resto >= divisor) { resto -= divisor; quociente++; } // sem usar o operador de divisão inteira
        System.out.println("Quociente: " + quociente + " | Resto: " + resto);
    }
}
