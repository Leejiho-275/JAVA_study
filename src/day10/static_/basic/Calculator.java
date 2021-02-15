package day10.static_.basic;

public class Calculator {

    String color;
    static double pi;
    String company = "카시오";

    void paint(String color) {
        this.color = color;
    }

    static double calcCircle(int r) {
        return pi * r * r;
    }
}
