package day02;

public class Casting2 {
    public static void main(String[] args) {
        int a = 1000;
        byte b = (byte) a;
        System.out.println("b = " + b);

        double c = 500.333333;
        int d = (int) c;
        double e = d;
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int m = 65;
        char n = (char) m;
        System.out.println("n = " + n);
    }
}
