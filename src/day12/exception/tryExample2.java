package day12.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryExample2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        try {
            System.out.print("정수1 : ");
            num1 = sc.nextInt();
            System.out.print("정수2 : ");
            num2 = sc.nextInt();

            System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("정수형 숫자만 입력하세요!");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 정상 종료 되었습니다.");
    }
}
