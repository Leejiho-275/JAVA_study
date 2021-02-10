package day09.player;

public class Player {

    public String name;
    int level;
    int hp;

    public Player() {
        this("이름없음",1,50);
//        System.out.println("1번 생성자 호출");
    }

    public Player(String name) {
        this(name,1,50);
//        System.out.println("2번 생성자 호출");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String name, int level) {
//        System.out.println("3번 생성자 호출");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    public Player(String name, int level, int hp) {
//        System.out.println("4번 생성자 호출");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    void attack(Player target) {
        System.out.println("=========================");
//        System.out.println("this의 주소값 : "+this);
//        System.out.println("target의 주소값 : "+target);
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
    }

    //    한 명의 플레이어 정보 출력
    public void info() {
        System.out.printf("이름 : %s, 레벨 : %d, 체력 : %d\n", this.name, this.level, this.hp);
    }

}
