package lista03;

public class L03H {
    public static void main(String[] args) {
        int c = 10;
        while (c <= 100) {
            System.out.println(c + " °C = " + (9.0 * c + 160) / 5 + " °F");
            c += 10;
        }
    }
}
