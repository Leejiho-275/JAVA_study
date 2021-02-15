package day10.inherit.player;

//부모 클래스 (super class)
//상속을 사용하지 않으면 자동으로 Object를 상속함
public class Player extends Object{

    String name;
    int level;
    int hp;

    public Player() {
    }

    public Player(String name, int level, int hp) {
        System.out.println("Player 객체 생성!");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    void info() {
        System.out.println("====== 캐릭터 정보 ======");
        System.out.println("# 이름 : " + this.name);
        System.out.println("# 레벨 : " + this.level);
        System.out.println("# 체력 : " + this.hp);
    }
}