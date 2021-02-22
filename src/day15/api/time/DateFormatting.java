package day15.api.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

//        날짜 형식을 바꿀때는 DateTimeFormatter를 사용
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        // MM월 일 때 : 02월로 표기, dd일 일 때 : 0x일로 표기, H일 시 24시로 표현
        String format = now.format(f);
        System.out.println("형식변환 날짜 : " + format);
    }
}
