package day08.bank;

public class Banking {

    public static void main(String[] args) {

//        은행원 생성
        Banker pororo = new Banker("뽀로로");
        Banker doolri = new Banker("둘리");

//        사용자 생성
        User gildong = new User("고길동");

//        사용자의 계좌 생성 요청
        gildong.requestMakeAccount(pororo, new Paper(gildong.name, "1234"));

        System.out.println("고길동 통장 비밀번호 : " + gildong.account.password);

    }
}
