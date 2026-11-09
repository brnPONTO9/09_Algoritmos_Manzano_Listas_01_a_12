package lista11;

import java.util.Scanner;
public class Extra1C {
    static void porValor(String nome, char sexo) {
        System.out.println("[valor] " + (sexo == 'M' ? "Ilmo. Sr. " : "Ilma Sra. ") + nome);
    }
    static void porReferencia(String nome, char sexo, String[] r) {
        r[0] = (sexo == 'M' ? "Ilmo. Sr. " : "Ilma Sra. ") + nome;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = Character.toUpperCase(in.nextLine().charAt(0));
        porValor(nome, sexo);
        String[] r = new String[1];
        porReferencia(nome, sexo, r);
        System.out.println("[referência] " + r[0]);
    }
}
