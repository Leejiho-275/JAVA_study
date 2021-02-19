package day14.api.lang.system;

public class SystemTime {

    public static void main(String[] args) {

        /*
        #유닉스 시간(Epoch Time):
        1970년 1월 1일 00시를 기준으로 시간을 측정.
        아래의 메서드는 저 시점부터 현재까지의 시간을 밀리초로 표현하여 리턴
        */
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);

//        시간복잡도 성능 테스트
        long start = System.currentTimeMillis();

        long total = 0;
        for (long i = 0; i < 100000000000L; i++) {
            total += i;
        }
        long end = System.currentTimeMillis();

        double time = (end - start) / 1000.0;
        System.out.println("실행시간 : " + time + "초");
    }
}
