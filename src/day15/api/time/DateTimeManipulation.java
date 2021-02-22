package day15.api.time;

import java.time.LocalDateTime;
import java.util.Locale;

public class DateTimeManipulation {

    public static void main(String[] args) {

        // 책 대여 시간
        LocalDateTime now = LocalDateTime.now();

        // 책 반납 시간
        LocalDateTime target = now.plusDays(3);
        System.out.println("반납 일자 : " + target);

        LocalDateTime target2 = now.plusYears(1).plusMonths(2).plusDays(10).plusHours(8).minusMinutes(30);
        System.out.println("target2 : " + target2);

        // 메서드 체이닝
        String str = "Hello WORLD";

        // str을 모두 소문자로 변경한 후 첫글자만 저장하고 싶음
        /*
        str = str.toLowerCase();
        char c = str.charAt(0);
        */

//        char c = str.toLowerCase().charAt(0);
        int index = str.toLowerCase().replace("hello", "안녕").trim().indexOf("w");
        System.out.println(index);
    }
}
