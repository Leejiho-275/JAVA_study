package day12.abs.bad;

public class Main {
    public static void main(String[] args) {

        Juicy js = new JuicySeoul();
        js.orderAppleJuice();
        js.orderGrapeJuice();

        Juicy jd = new JuicyDaejeon();
        jd.orderAppleJuice();
        jd.orderGrapeJuice();
    }
}
