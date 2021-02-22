package day15.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Basic {

    public static void main(String[] args) {

        // 날짜 정보 얻기
        LocalDate curDate = LocalDate.now();
        System.out.println("현재날짜 : " + curDate);

        LocalDate targetDate = LocalDate.of(2022, 2, 24);
        System.out.println("목표날짜 : " + targetDate);

        // 시간 정보 얻기
        LocalTime curTime = LocalTime.now();
        System.out.println("현재시간 : " + curTime);

        LocalTime targetTime = LocalTime.of(19, 28, 30);
        System.out.println("목표 시간 : " + targetTime);

        // 날짜와 시간정보 얻기
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간 : " + curDateTime);

        System.out.println(curDateTime.getYear());
        System.out.println(curDateTime.getMonth());
        System.out.println(curDateTime.getMonthValue());
        System.out.println(curDateTime.getDayOfMonth());
        System.out.println(curDateTime.getDayOfYear());
        System.out.println(curDateTime.getDayOfWeek());
    }
}
