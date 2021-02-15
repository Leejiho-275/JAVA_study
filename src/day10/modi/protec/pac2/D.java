package day10.modi.protec.pac2;

import day10.modi.protec.pac1.A;

public class D extends A {

    public D(){
//        super(3.3); // default 제한
        super(100); // protected 제한

        f1=100; // protected
//        f2=200; // default

        m1(); // protected
//        m2(); // default
    }
}
