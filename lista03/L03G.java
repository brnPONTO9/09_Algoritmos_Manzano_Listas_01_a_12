package lista03;

public class L03G {
    public static void main(String[] args) {
        int anterior = 1, atual = 1, termo = 1;
        while (termo <= 15) {
            System.out.print(anterior + " ");
            int prox = anterior + atual;
            anterior = atual;
            atual = prox;
            termo++;
        }
        System.out.println();
    }
}
