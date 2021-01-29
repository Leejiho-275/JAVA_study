package day01;

public class VarScope {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        if (true) {
            int num3 = num1 + num2;
        } // end if
//        System.out.println(num3);

    } // end main
} // end class
