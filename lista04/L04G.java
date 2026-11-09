package lista04;

public class L04G {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 2 != 0) {
                long fat = 1;
                for (int k = 2; k <= n; k++) fat *= k;
                System.out.println(n + "! = " + fat);
            }
            n++;
        } while (n <= 10);
    }
}
