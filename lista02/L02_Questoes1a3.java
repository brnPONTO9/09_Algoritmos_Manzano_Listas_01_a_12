package lista02;

public class L02_Questoes1a3 {
    public static void main(String[] args) {
        // Questão 1 (a = 5)
        int a = 5;
        System.out.println("1A  2>3 = " + (2 > 3));                                        // falso
        System.out.println("1B  (6<8) ou (3>7) = " + ((6 < 8) || (3 > 7)));                // verdadeiro
        System.out.println("1C  nao(2<3) = " + !(2 < 3));                                  // falso
        System.out.println("1D  (5>=6 ou 6<7 ou nao(a+5-6=8)) = " + ((5 >= 6) || (6 < 7) || !(a + 5 - 6 == 8))); // verdadeiro
        // Questão 2 (x=1, a=3, b=5, c=8, d=7)
        int x = 1; a = 3; int b = 5, c = 8, d = 7;
        System.out.println("2A  " + !(x > 3));
        System.out.println("2B  " + ((x < 1) && !(b > d)));
        System.out.println("2C  " + (!(d < 0) && (c > 5)));
        System.out.println("2D  " + (!(x > 3) && (c < 7)));
        System.out.println("2E  " + ((a > b) || (c > b)));
        System.out.println("2F  " + (x >= 2));
        System.out.println("2G  " + ((x < 1) && (b >= d)));
        System.out.println("2H  " + ((d < 0) || (c > 5)));
        System.out.println("2I  " + (!(d > 3) || !(b < 7)));
        System.out.println("2J  " + ((a > b) || !(c > b)));
        // Questão 3 (a=2, b=3, c=5, d=9)
        a = 2; b = 3; c = 5; d = 9;
        System.out.println("3A  " + (!(d > 5) ? "x <- (a + b) * d" : "x <- (a-b) /c"));
        System.out.println("3B  " + ((a > 2) && (b < 7) ? "x <- (a + 2) * (b - 2)" : "x <- (a + b) / d * (c + d)"));
        System.out.println("3C  " + ((a == 2) || (b < 7) ? "x <- (a + 2) * (b -2)" : "x <- (a + b) / d * (c + d)"));
        System.out.println("3D  " + ((a > 2) || !(b < 7) ? "x <- a + b - 2" : "x <- a - b"));
        System.out.println("3E  " + (!(a > 2) || !(b < 7) ? "x <- a + b" : "x <- a / b"));
        System.out.println("3F  " + (!(a > 3) && !(b < 5) ? "x <- a + d" : "x <- d / b"));
        System.out.println("3G  " + ((c >= 2) && (b <= 7) ? "x <- (a + d) / 2" : "x <- d * c"));
        System.out.println("3H  " + ((a >= 2) || (c <= 1) ? "x <- (a + d) / 2" : "x <- d * c"));
    }
}
