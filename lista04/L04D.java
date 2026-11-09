package lista04;

public class L04D {
    public static void main(String[] args) {
        double graos = 1, total = 0; // reais como acumuladores (o total passa de 10^19)
        int quadro = 1;
        do { total += graos; graos *= 2; quadro++; } while (quadro <= 64);
        System.out.printf("Total de grãos no tabuleiro: %.0f%n", total); // 2^64 - 1
    }
}
