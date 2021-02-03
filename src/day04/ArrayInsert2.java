package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] names = new String[count];

        while (true) {
            System.out.print("# 이름 : ");
            String newName = sc.next();

//            자바는 문자열 비교할 때 ==대신 .equals()를 사용
            if (newName.equals("그만")) {
                System.out.println("입력 종료");
                break;
            }

//            배열 데이터 추가 알고리즘
            String[] temp = new String[count + 1];
            for (int i = 0; i < count; i++) {
                temp[i] = names[i];
            }
            temp[temp.length - 1] = newName;
            names = temp;
            temp = null;
            count++;
        }

        System.out.printf("학생 수 : %d명\n", count);
        System.out.println("이름 목록 : " + Arrays.toString(names));
    }
}
