package day10.inherit.player;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("전사");
//        w.name = "전사";
        w.level = 1;
        w.hp = 50;
        w.rage = 30;

        w.info();

        Mage m = new Mage();
        m.name = "마법사";
        m.level = 1;
        m.hp = 20;

        m.info();
    }
}
