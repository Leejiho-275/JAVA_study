package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보 : " + Arrays.toString(members));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");

            String modifyMember = sc.nextLine();
            int index;
            for (index = 0; index < members.length; index++) {
                if (modifyMember.equals(members[index])) {
                    break;
                }
            }
            if (index == members.length) {
                System.out.println("해당 멤버는 존재하지 않습니다.");
                continue;
            } else {
                System.out.printf("%s의 별명을 변경합니다.\n", members[index]);
                System.out.print("> ");
                String newNickname = sc.nextLine();
                members[index] = newNickname;
                System.out.println("변경 완료!");
                break;
            }

        }
        System.out.println("* 변경 후 정보 : " + Arrays.toString(members));
        sc.close();
    }
}
