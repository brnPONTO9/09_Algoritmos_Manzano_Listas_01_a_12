package lista03;

public class L03C {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        while (i <= 500) { if (i % 2 == 0) soma += i; i++; }
        System.out.println("Soma dos pares de 1 a 500: " + soma);
    }
}
