package day02;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println((x != 10) & (++y == 21));
        System.out.println((x == 10) | (++y == 21));
        System.out.println("x : " + x + " y : " + y);
        System.out.println();

        int a=10,b=20;
        System.out.println((a != 10) && (++b == 21));
        System.out.println((a == 10) || (++b == 21));
        System.out.println("a : " + a + " b : " + b);
    }
}
