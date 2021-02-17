package day11.poly.player;

public class Warrior extends Player {

    int rage;

    //    생성자
    public Warrior(String name) {
        super(name, 1, 50);
//        System.out.println("Warrior 객체 생성!");
    }

    void rush() {
        System.out.println(this.name + "님이 돌진합니다.");
    }

    //    메서드 오버라이딩
    @Override
    // 오버라이딩 검증 아노테이션
    void info() {
        super.info();
        System.out.println("# 분노 : " + this.rage);

    }

    public void fireSlash(Player user) {
        /*
        int damage;
        System.out.printf("%s님이 %s님에게 FireSlash를 시전하였습니다.\n", this.name, user.name);
        if (user instanceof Warrior) {
            damage = 10;
            user.hp -= 10;
            System.out.printf("%s님(전사)이 %d의 피해를 입었습니다.\n", user.name, damage);
            System.out.printf("%s님의 현재 체력 : %d\n", user.name, user.hp);
        } else if (user instanceof Mage) {
            damage = 20;
            user.hp -= 20;
            System.out.printf("%s님(마법사)이 %d의 피해를 입었습니다.\n", user.name, damage);
            System.out.printf("%s님의 현재 체력 : %d\n", user.name, user.hp);
        } else if (user instanceof Hunter) {
            damage = 15;
            user.hp -= 15;
            System.out.printf("%s님(사냥꾼)이 %d의 피해를 입었습니다.\n", user.name, damage);
            System.out.printf("%s님의 현재 체력 : %d\n", user.name, user.hp);
        }
        */

        int damage;
        String job;
        System.out.printf("%s님이 %s님에게 FireSlash를 시전하였습니다.\n", this.name, user.name);
        if (user instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (user instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (user instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        user.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n",user.name,job,damage);
        System.out.printf("%s님의 현재 체력 : %d\n", user.name, user.hp);
    }

}
