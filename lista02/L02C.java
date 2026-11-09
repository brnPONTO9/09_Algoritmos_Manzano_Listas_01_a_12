package lista02;

import java.util.Scanner;
public class L02C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quatro notas: ");
        double soma = 0;
        for (int i = 0; i < 4; i++) soma += in.nextDouble();
        double media = soma / 4;
        if (media >= 5) System.out.println("Aluno aprovado. Média: " + media);
        else System.out.println("Aluno reprovado. Média: " + media);
    }
}
