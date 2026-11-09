package lista03;

public class L03J {
    public static void main(String[] args) {
        int n = 50, soma = 0, qtd = 0;
        while (n <= 70) { if (n % 2 == 0) { soma += n; qtd++; } n++; }
        System.out.println("Soma dos pares de 50 a 70: " + soma + " | Média: " + (double) soma / qtd);
    }
}
