package lista05;

public class L05I {
    public static void main(String[] args) {
        int a = 1, b = 1;
        for (int termo = 1; termo <= 15; termo++) { System.out.print(a + " "); int c = a + b; a = b; b = c; }
        System.out.println();
    }
}
