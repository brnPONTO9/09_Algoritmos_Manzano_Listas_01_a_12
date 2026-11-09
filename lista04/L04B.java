package lista04;

public class L04B {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        do { if (i % 2 == 0) soma += i; i++; } while (i <= 500);
        System.out.println("Soma dos pares de 1 a 500: " + soma);
    }
}
