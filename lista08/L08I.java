package lista08;

import java.util.Scanner;
public class L08I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];
        double[] medias = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = in.nextLine();
            System.out.print("Nota do 1º semestre: ");
            notas[i][0] = in.nextDouble();
            System.out.print("Nota do 2º semestre: ");
            notas[i][1] = in.nextDouble();
            in.nextLine();
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }
        for (int i = 0; i < 4; i++) // ordena (bubble sort) nomes e médias juntos
            for (int j = 0; j < 4 - i; j++)
                if (medias[j] > medias[j + 1]) {
                    double m = medias[j]; medias[j] = medias[j + 1]; medias[j + 1] = m;
                    String n = nomes[j]; nomes[j] = nomes[j + 1]; nomes[j + 1] = n;
                }
        for (int i = 0; i < 5; i++) System.out.printf("%s - média anual %.2f%n", nomes[i], medias[i]);
    }
}
