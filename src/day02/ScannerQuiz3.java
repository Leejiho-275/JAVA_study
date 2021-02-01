package day02;

import java.util.Scanner;

public class ScannerQuiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.println("-----------------");
        System.out.printf("이름 : %s", name);
        System.out.println();
        System.out.printf("출생년도 : %d", 2022 - age);
    }
}
