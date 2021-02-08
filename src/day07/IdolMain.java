package day07;

//실행 클래스 : main메서드가 있는 곳
public class IdolMain {
    public static void main(String[] args) {

//        아이돌 객체 생성
        Idol kara = new Idol();
        kara.teamName = "카라";
        kara.memberNumber = 5;
        kara.memberNames = new String[]{"박규리", "한승연", "니콜", "구하라", "강지영"};

        kara.introduce();

        System.out.println("========================");
        Idol tvxq = new Idol();
        tvxq.teamName = "동방신기";
        tvxq.memberNumber = 2;
        tvxq.memberNames = new String[]{"유노윤호", "최강창민"};

        tvxq.introduce();

    }
}
