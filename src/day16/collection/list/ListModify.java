package day16.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListModify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> members = new ArrayList<>(Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"));

//        members.add("영웅재중");
//        members.add("최강창민");
//        members.add("시아준수");
//        members.add("믹키유천");
//        members.add("유노윤호");
        System.out.println("* 변경 전 정보 : " + members);

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");

            String modifyMember = sc.nextLine();
            if (!members.contains(modifyMember)) {
                System.out.println("해당 멤버는 존재하지 않습니다.");
            } else {
                System.out.printf("%s의 별명을 변경합니다.\n", modifyMember);
                System.out.print("> ");
                members.set(members.indexOf(modifyMember), sc.nextLine());
                System.out.println("변경 완료!");
                break;
            }
        }
        System.out.println("* 변경 후 정보 : " + members);
        sc.close();
    }
}
