package day15.generic.good;

public class Basket<F extends Fruits> {

    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
