package day04;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5};

        int newNumber = 7;

//        1. 확장된 배열의 생성
        int[] temp = new int[arr.length + 1];

//        2. 기존 배열데이터를 복사해서 신규 배열에 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
//        3. 추가된 공간에 신규데이터를 삽입
        temp[temp.length - 1] = newNumber;
        System.out.println(Arrays.toString(temp));

//        4. temp의 주소를 arr로 옮기고 temp를 삭제
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));

    }
}
