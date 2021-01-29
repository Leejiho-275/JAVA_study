package day01;

public class FloatEx {
    public static void main(String[] args) {
        float a = 7.12345F;
        double b = 7.12345;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        double n=0;
        for(int i=0;i<100;i++){
            n+=0.1;
        }
        System.out.println("n = " + n);
    }
}
