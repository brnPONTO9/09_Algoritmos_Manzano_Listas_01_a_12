package lista01;

import java.util.Scanner;
public class L01D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tempo gasto (h): ");
        double tempo = in.nextDouble();
        System.out.print("Velocidade média (km/h): ");
        double velocidade = in.nextDouble();
        double distancia = tempo * velocidade;
        double litros = distancia / 12;
        System.out.println("Velocidade: " + velocidade + " | Tempo: " + tempo + " | Distância: " + distancia + " | Litros usados: " + litros);
    }
}
