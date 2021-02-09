package day08;

public class Phone {

    //    필드 선언 : 속성
    String model;
    String color;
    int price;
    boolean power; // 전원이 켜진 여부

    //    생성자 선언
    Phone() {
        model = "애니콜";
        color = "쥐색";
        price = 50000;
    }

    Phone(String pModel) {
        model = pModel;
        color = "검정색";
        price = 200000;
    }

    Phone(String pModel, String pColor) {
        model = pModel;
        color = pColor;
        price = 400000;
    }

    Phone(String pModel, String pColor, int pPrice) {
        model = pModel;
        color = pColor;
        price = pPrice;
    }

    //    메서드 선언 : 기능
    void powerOn() {
        System.out.println(model + "의 전원을 켭니다.");
        power = true;
    }

    void showSpec() {
        if (!power) {
            System.out.println("전원을 먼저 켜세요.");
            powerOn();
            return;
        }
        System.out.println("\n*** 휴대폰의 정보 ***");
        System.out.println("# 모델명 : " + model);
        System.out.println("# 색상 : " + color);
        System.out.println("# 가격 : " + price + "원");
    }

}
