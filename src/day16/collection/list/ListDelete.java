package day16.collection.list;

import java.util.*;

public class ListDelete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> members = new ArrayList<>(Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"));
        System.out.println("* 우리반 학생들의 별명 : " + members);

        System.out.println("별명을 추가하고 싶다면 <추가>를, 삭제하고 싶다면 <삭제>를 입력하세요.");
        System.out.print("> ");
        String order = sc.nextLine();

        if (order.equals("삭제")) {
            while (true) {
                System.out.println("- 삭제할 학생의 별명을 입력하세요.");
                System.out.print("> ");

                String delMember = sc.nextLine();
                if (!members.contains(delMember)) {
                    System.out.printf("해당 별명(%s)는 존재하지 않습니다.\n", delMember);
                } else {
                    System.out.printf("%s의 별명을 삭제합니다.\n", delMember);
                    System.out.print("> ");
                    members.remove(delMember);
                    break;
                }
            }
            System.out.println("* 삭제 후 정보 : " + members);
        } else {
            while (true) {
                System.out.println("- 추가할 학생의 별명을 입력하세요.");
                System.out.print("> ");
                String addMember = sc.nextLine();

                System.out.println("- 누구 앞에 추가하실건가요?");
                System.out.print("> ");
                String chooseMember = sc.nextLine();
                if (!members.contains(chooseMember)) {
                    System.out.println("해당 멤버는 존재하지 않습니다.");
                } else {
                    System.out.printf("%s을(를) 추가합니다.\n", addMember);
                    System.out.print("> ");
                    members.add(members.indexOf(chooseMember), addMember);
                    System.out.println("변경 완료!");
                    break;
                }
            }
            System.out.println("* 추가 후 정보 : " + members);
        }
        sc.close();
    }
}
