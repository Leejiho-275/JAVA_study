package day11.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2();
//        p.method3();

        System.out.println("=====================");

        Parent c = new Child();
        c.method1();
        c.method2();
        ((Child)c).method3();
    }
}
