package day02;

public class PlusMinusOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5 * y-- + x++ - --y;
//        x : 5, y : 17, z : 82;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
