package lista07;

import java.util.Arrays;
import java.util.Scanner;
public class Extra1A {
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
        int[] a = new int[20], b = new int[20];
        for (int i = 0; i < 20; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextInt(); b[i] = a[i] + 2; }
        Arrays.sort(b);
        System.out.println("B ordenada: " + Arrays.toString(b));
        System.out.print("Valor a pesquisar (busca binária): ");
        int pos = buscaBinaria(b, in.nextInt());
        System.out.println(pos >= 0 ? "Encontrado na posição " + (pos + 1) : "Não encontrado");
    }
}
