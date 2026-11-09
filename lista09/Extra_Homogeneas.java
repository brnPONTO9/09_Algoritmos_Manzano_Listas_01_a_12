package lista09;

import java.util.Scanner;
/**
 * Extra 9.6: o mesmo cadastro de empregados do L09_4, mas SEM registro: só vetores homogêneos
 * (um vetor para cada campo), como no Visualg.  empregado_NOME[i], empregado_SALARIO[i] ...
 */
public class Extra_Homogeneas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        String[] empregado_NOME = new String[n];
        double[][] empregado_SALARIO = new double[n][4]; // 4 salários por empregado (como no exemplo do livro)
        for (int i = 0; i < n; i++) {
            System.out.print("Nome do empregado " + (i + 1) + ": ");
            empregado_NOME[i] = in.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.print("  Salário " + (j + 1) + ": ");
                empregado_SALARIO[i][j] = Double.parseDouble(in.nextLine().replace(',', '.'));
            }
        }
        for (int i = 0; i < n; i++) {
            double soma = 0;
            for (double s : empregado_SALARIO[i]) soma += s;
            System.out.printf("%s - média salarial %.2f%n", empregado_NOME[i], soma / 4);
        }
    }
}
