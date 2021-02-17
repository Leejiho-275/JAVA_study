package day12.exception;

public class tryExample1 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;
        System.out.println("나눗셈 시작!");

        try {
//        예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (Exception e) {
            System.out.println("0으로 나누면 안됩니다!");
        }

        System.out.println("프로그램이 정상 종료되었습니다.");
    }
}
