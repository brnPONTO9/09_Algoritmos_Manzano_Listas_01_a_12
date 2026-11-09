package lista03;

public class L03E {
    public static void main(String[] args) {
        long potencia = 1; // 3^0 = 1
        int exp = 0;
        while (exp <= 15) {
            System.out.println("3^" + exp + " = " + potencia);
            potencia *= 3;
            exp++;
        }
    }
}
