package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원(2 ~ 4)명 ==> ");

//        memberNum은 게임 참여 인원 수를 저장
        int memberNum = sc.nextInt();
        System.out.println("\n플레이어 이름을 등록합니다.");

//        게임 인원 수 검증
        if (memberNum < 2 || memberNum > 4) {
            System.out.println("인원 수가 올바르지 않습니다. GAME OVER");
            return;
        }

        String[] members = new String[memberNum];
        for (int i = 0; i < memberNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i + 1);
            members[i] = sc.next();
        }
        System.out.println(Arrays.toString(members) + " 참가!");

        System.out.print("\n실탄 개수 (6 미만) ==> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
//        탄창 생성
        boolean[] bullet = new boolean[6];

//        실탄 무작위 셋팅
        for (int i = 0; i < bulletNum; i++) {
            int ran = (int) (Math.random() * bullet.length);
            if (bullet[ran]) {
                --i;
                continue;
            } else {
                bullet[ran] = true;
            }
        }
        System.out.println(Arrays.toString(bullet));

//        --게임 시작--
        int startIdx = (int) (Math.random() * memberNum);
        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", members[startIdx]);

        while (true) {
            System.out.printf("\n[%s의 턴!!] 탄창을 돌립니다.\n", members[startIdx]);
//            격발 전 총알 위치를 랜덤 결정
            int bulletPos = (int)(Math.random() * bullet.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
//            엔터만을 입력받고 끝내려면 nextLine()을 입력
            sc.nextLine();

            if (bullet[bulletPos]) {
                System.out.printf("\n빵!!! [%s] 사망...\n", members[startIdx]);
                break;
            } else {
                System.out.println("휴... 살았습니다.");
                if (startIdx != memberNum - 1) {
                    startIdx++;
                } else {
                    startIdx = 0;
                }
            }
        }
    }

}

