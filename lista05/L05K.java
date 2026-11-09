package lista05;

public class L05K {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n += 2) {
            long fat = 1;
            for (int k = 2; k <= n; k++) fat *= k;
            System.out.println(n + "! = " + fat);
        }
    }
}
