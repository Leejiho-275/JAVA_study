package day11.poly.player;

public class Mage extends Player {

    int mana;

    public Mage() {
        super("마법사", 1, 50);
    }

    public Mage(String name) {
        this.name = name;
        this.hp = 40;
    }

    public void meteo(Player... user) {
        if (user.length > 0) {
            System.out.printf("%s님이 메테오 시전!!\n", this.name);
            System.out.println("---------------------------");

            for (Player u : user) {
                if (u == this) continue;
                int damage = (int) ((Math.random() * 6) + 10);
                u.hp = u.hp - damage;
                System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력 : %d)\n", u.name, damage, u.hp);
            }
        } else {
            System.out.println("타겟이된 플레이어가 없습니다.");
        }

    }

    @Override
    void info() {
        super.info();
        System.out.println("# 마나 : " + this.mana);
    }

}
