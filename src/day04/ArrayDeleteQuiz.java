package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명 : " + Arrays.toString(members));

        System.out.println("별명을 추가하고 싶다면 <추가>를, 삭제하고 싶다면 <삭제>를 입력하세요.");
        System.out.print("> ");
        String order = sc.nextLine();

        if (order.equals("삭제")) {
            while (true) {
                System.out.println("- 삭제할 학생의 별명을 입력하세요.");
                System.out.print("> ");

                String delMember = sc.nextLine();
                int index;
                for (index = 0; index < members.length; index++) {
                    if (delMember.equals(members[index])) {
                        break;
                    }
                }
                if (index == members.length) {
                    System.out.printf("해당 별명(%s)는 존재하지 않습니다.\n", delMember);
                    continue;
                } else {
                    System.out.printf("%s의 별명을 삭제합니다.\n", members[index]);
                    for (int i = index; i < members.length - 1; i++) {
                        members[i] = members[i + 1];
                    }
                    String[] temp = new String[members.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = members[i];
                    }
                    members = temp;
                    temp = null;
                    break;
                }

            }
            System.out.println("* 삭제 후 정보 : " + Arrays.toString(members));
        } else {
            while (true) {
                System.out.println("- 추가할 학생의 별명을 입력하세요.");
                System.out.print("> ");
                String addMember = sc.nextLine();

                System.out.println("- 누구 앞에 추가하실건가요?");
                System.out.print("> ");
                String chooseMember = sc.nextLine();
                int index;
                for (index = 0; index < members.length; index++) {
                    if (chooseMember.equals(members[index])) {
                        break;
                    }
                }
                if (index == members.length) {
                    System.out.printf("해당 별명(%s)는 존재하지 않습니다.\n", chooseMember);
                    continue;
                } else {
                    System.out.printf("%s을(를) 추가합니다.\n", chooseMember);
                    String[] temp = new String[members.length + 1];
                    for (int i = 0; i < index; i++) {
                        temp[i] = members[i];
                    }
                    temp[index] = addMember;
                    for (int i = index + 1; i < temp.length; i++) {
                        temp[i] = members[i - 1];
                    }
                    members = temp;
                    temp = null;
                    break;
                }
            }
            System.out.println("* 추가 후 정보 : " + Arrays.toString(members));
        }
    }

}

