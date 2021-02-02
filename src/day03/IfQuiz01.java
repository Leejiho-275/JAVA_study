package day03;

import java.util.Scanner;

public class IfQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("신장 : ");
        double height = sc.nextDouble();
        System.out.print("나이 : ");
        int age = sc.nextInt();

        if ((height >= 140) && (age >= 8)) {
            System.out.println("놀이기구에 탑승할 수 있습니다.");
        } else {
            System.out.println("놀이기구에 탑승할 수 없습니다.");
        }
        System.out.println("오늘 하루 즐거운 하루 되세요~!");
        sc.close();
    }
}
