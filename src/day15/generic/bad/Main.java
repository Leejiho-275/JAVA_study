package day15.generic.bad;

public class Main {

    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        System.out.println(ab.getApple());

        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());
        System.out.println(pb.getPeach());
    }
}
