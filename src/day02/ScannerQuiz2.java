package day02;

import java.util.Scanner;

public class ScannerQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("얼마 있어요?? ");
        int money = sc.nextInt();
        if (money >= 5000) {
            System.out.println("선택된 음식 : 김치찌개");
        } else if (money >= 2500) {
            System.out.println("선택된 음식 : 라면");
        } else if (money == 0) {
            System.out.println("굶어!");
        }

    }
}
