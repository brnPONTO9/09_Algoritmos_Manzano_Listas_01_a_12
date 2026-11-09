package lista01;

import java.util.Scanner;
public class L01H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Comprimento, largura e altura: ");
        double c = in.nextDouble(), l = in.nextDouble(), h = in.nextDouble();
        System.out.println("Volume: " + c * l * h);
    }
}
