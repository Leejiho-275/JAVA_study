package day16.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListInsert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> foods = new ArrayList<>();

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.print("> ");
            String answer = sc.nextLine();
            if(answer.equals("그만")) {
                System.out.println("입력 종료!!");
                sc.close();
                break;
            }
            foods.add(answer);

        }
        System.out.print("내가 먹고싶은 음식들: " + foods);

    }
}
