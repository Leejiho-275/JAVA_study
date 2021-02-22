package day15.api.time;

import java.time.LocalDateTime;

public class DateTimeCompare {

    public static void main(String[] args) {
        // 행사 시작일
        LocalDateTime startTime = LocalDateTime.of(2020, 12, 10, 9, 0, 0);
        // 행사 종료일
        LocalDateTime endTime = LocalDateTime.of(2021, 3, 14, 18, 0, 0);

        if (LocalDateTime.now().plusMonths(5).isBefore(endTime)) {
            System.out.println("행사 진행중입니다.");
        } else {
            System.out.println("종료된 행사입니다.");
        }
    }
}
