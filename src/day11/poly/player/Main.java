package day11.poly.player;

public class Main {

    public static void main(String[] args) {
        Warrior w = new Warrior("warrior1");
        Mage m = new Mage("mage1");
        Hunter h = new Hunter("hunter1");

        /*
        m.meteo(w,h);
        m.meteo(w);
        */

        w.fireSlash(new Warrior("testWarrior"));
        w.fireSlash(m);
        w.fireSlash(h);
    }
}
