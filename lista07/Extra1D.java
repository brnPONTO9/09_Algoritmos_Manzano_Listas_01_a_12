package lista07;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1D {
    static int[] ler(Scanner in, String nome) {
        int[] v = new int[15];
        for (int i = 0; i < 15; i++) { System.out.print(nome + "[" + (i + 1) + "]: "); v[i] = in.nextInt(); }
        return v;
    }
    static int buscaBinaria(int[] v, int alvo) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == alvo) return meio;
            if (alvo < v[meio]) fim = meio - 1; else ini = meio + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = ler(in, "A"), b = ler(in, "B"), c = ler(in, "C"), d = new int[15];
        for (int i = 0; i < 15; i++) d[i] = a[i] + b[i] + c[i];
        System.out.println("D = " + Arrays.toString(d));
        int[] ordenado = d.clone();
        Arrays.sort(ordenado); // a busca binária exige vetor ordenado
        System.out.print("Valor a pesquisar em D: ");
        int pos = buscaBinaria(ordenado, in.nextInt());
        System.out.println(pos >= 0 ? "Existe em D (posição " + (pos + 1) + " do vetor ordenado)" : "Não existe em D");
    }
}
