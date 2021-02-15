package day10.inherit.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Computer com = new Computer();

//        반지름
        double radius = 5;

        System.out.println("계산기 결과 : " + cal.calcAreaCircle(radius));
        System.out.println("컴퓨터 결과 : " + com.calcAreaCircle(radius));

    }
}
