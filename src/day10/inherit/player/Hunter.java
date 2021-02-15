package day10.inherit.player;

public class Hunter extends Player {

    int arrow;

    public Hunter(String name, int level, int hp) {
        super(name, level, hp);
    }

    void multiShot() {
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 화살 : " + this.arrow);
    }
}
