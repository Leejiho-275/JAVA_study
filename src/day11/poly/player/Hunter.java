package day11.poly.player;

public class Hunter extends Player {

    int arrow;

    public Hunter(String name, int level, int hp) {
        super(name, level, hp);
    }

    public Hunter(String name) {
        this.name = name;
        this.hp = 60;
    }

    void multiShot() {
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 화살 : " + this.arrow);
    }
}
