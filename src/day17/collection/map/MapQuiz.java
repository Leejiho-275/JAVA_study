package day17.collection.map;

import java.util.*;

public class MapQuiz {

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        users.put("kim1234", "kkk1234");
        users.put("lee5678", "lll5678");
        users.put("park4321", "ppp4321");

        while (true) {
            System.out.println("------------------------");
            System.out.println("아이디와 비밀번호를 입력하세요.");
            System.out.print("ID : ");
            String id = sc.next();
            if (users.containsKey(id)) {
                System.out.print("PW : ");
                if (users.get(id).equals(sc.next())) {
                    System.out.println("로그인 성공!");
                    sc.close();
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("회원가입된 아이디가 아닙니다.");
            }
        }
    }
}

