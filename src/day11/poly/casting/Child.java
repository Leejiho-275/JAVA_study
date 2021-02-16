package day11.poly.casting;

public class Child extends Parent{
    @Override
    void method2() {
        System.out.println("자식의 재정의된 2번 메서드 호출!");
    }

    void method3(){
        System.out.println("자식의 오리지널 3번 메서드 호출!");
    }
}
