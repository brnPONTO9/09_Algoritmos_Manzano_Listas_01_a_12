package lista05;

public class L05D {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) if (i % 2 == 0) soma += i;
        System.out.println("Soma dos pares de 1 a 500: " + soma);
    }
}
