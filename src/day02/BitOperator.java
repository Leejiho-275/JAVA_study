package day02;

public class BitOperator {
    public static void main(String[] args) {
//        비트 반전 연산자
        byte x = 8;
        System.out.println("~x = " + ~x);

//        비트 연산
        byte a = 5;
        byte b = 3;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
