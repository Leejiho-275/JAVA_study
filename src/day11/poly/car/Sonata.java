package day11.poly.car;

public class Sonata extends Car {

    @Override
    void run() {
        System.out.println("소나타가 달립니다.");
    }

    void joinMembership() {
        System.out.println("소나타 회원이 되었습니다.");
    }
}
