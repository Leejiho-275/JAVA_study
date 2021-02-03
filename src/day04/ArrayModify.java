package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {
    public static void main(String[] args) {

        String[] foods = {"치킨", "보쌈", "피자", "삼겹살"};

        System.out.println("수정 전 정보 : " + Arrays.toString(foods));

        foods[1] = "족발";
        foods[2] = "파스타";

        System.out.println("수정 후 정보 : " + Arrays.toString(foods));

//        배열에 저장된 데이터의 인덱스를 탐색
//        (순차 탐색 알고리즘)

        Scanner sc = new Scanner(System.in);
        System.out.print("# 검색할 음식명 : ");
        String searchFood = sc.nextLine();

        int idx;
        for (idx = 0; idx < foods.length; idx++) {
            if (searchFood.equals(foods[idx])) {
                break;
            }
        }
        System.out.println("검색한 음식의 인덱스 : " + idx);

        if (idx == foods.length) {
            System.out.println("# 해당 음식명은 존재하지 않습니다.");
        } else {
            System.out.printf("# %s을(를) 수정합니다.\n", foods[idx]);
            System.out.print("# 새로운 음식명 : ");
            String newFood = sc.nextLine();

            foods[idx] = newFood;
            System.out.println("최종 수정 후 정보 : " + Arrays.toString(foods));
        }
            sc.close();

    }
}
