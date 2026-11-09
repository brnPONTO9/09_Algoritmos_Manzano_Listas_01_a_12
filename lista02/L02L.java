package lista02;

import java.util.Scanner;
public class L02L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = Character.toUpperCase(in.nextLine().charAt(0));
        if (sexo == 'M') System.out.println("Ilmo Sr. " + nome);
        else if (sexo == 'F') System.out.println("Ilma Sra. " + nome);
        else System.out.println("Sexo inválido");
    }
}
