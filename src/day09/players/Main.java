package day09.players;

import day09.player.Player;

public class Main {
    public static void main(String[] args) {

//        파티 생성
        Players party = new Players(5);

//        파티원 추가
        party.addPlayer(new Player("warrior",10,500));
        party.addPlayer(new Player("뽀로로"));
        party.addPlayer(new Player("뽀로로2"));
        party.addPlayer(new Player("뽀로로3"));
        party.addPlayer(new Player("뽀로로4"));
        party.addPlayer(new Player("뽀로로5"));

//        파티원 정보 확인
        System.out.println("================================");
        party.showPartyInfo();

    }
}
