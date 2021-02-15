package day10.static_.basic;

import day10.modi.protec.pac2.C;

public class Main {

    public static void main(String[] args) {
        Count c1 = new Count();
        c1.num1 = 10;
        c1.num2 = 10;

        Count c2 = new Count();
        c2.num1++;
        c2.num2++;

        Count c3 = new Count();
        c3.num1 += 20;
        c3.num2 += 20;

        System.out.println("c1.num1 : " + c1.num1);
        System.out.println("c2.num1 : " + c2.num1);
        System.out.println("c2.num1 : " + c3.num1);
        System.out.println("c1.num2 : " + c1.num2);
        System.out.println("c2.num2 : " + c2.num2);
        System.out.println("c2.num2 : " + c3.num2);

        double r=Math.PI;

        c2.method1();
        c3.method1();

    }
}
