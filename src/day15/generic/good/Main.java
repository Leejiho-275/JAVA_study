package day15.generic.good;

public class Main {

    public static void main(String[] args) {

        Basket<Apple> ab = new Basket<Apple>();

        ab.setFruit(new Apple());
        Apple apple = ab.getFruit();

        Basket<Peach> pb = new Basket<>();
        pb.setFruit(new Peach());
        Peach peach = pb.getFruit();
    }
}
