package day10.inherit.player;

public class Mage extends Player {

    int mana;

    public  Mage(){
        super("마법사",1,50);
    }

    void meteo() {
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 마나 : " + this.mana);
    }
}
