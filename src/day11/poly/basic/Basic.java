package day11.poly.basic;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Basic {

    A x1 = new A();
    B x2 = new B();
    C x3 = new C();
    D x4 = new D();
    E x5 = new E();

    //    모든 자식 객체는 부모의 타입을 가질 수 있다.
    A y1 = new B();
    A y2 = x3;
    B y3 = new D();
    A y4 = new D();
    A y5 = x5;
    C y6 = new E();

    //    상속관계가 없다면 타입 변환 불가능
//    B z1 = new C();
//    C z2 = new D();

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a);

        Object o1 = new A();
        Object o2 = new E();

    }
}
