package day11.poly.overloading;

public class Basic {

//    데이터를 전달하면 해당 데이터의 타입을 출력하는 메서드

    //    alertType(String)
    void alertType(String s) {
        System.out.println("문자열 1개가 전달됨!");
    }

    //    alertType(int)
    void alertType(int i) {
        System.out.println("정수 1개가 전달됨!");
    }

    void alertType(double d) {
        System.out.println("실수 1개가 전달됨!");
    }

    //    alertType(int, double)
    void alertType(int a, double b) {

    }

    //    alertType(double, int)
    void alertType(double a, int b) {

    }
}
