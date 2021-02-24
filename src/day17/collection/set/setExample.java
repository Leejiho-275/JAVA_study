package day17.collection.set;

import java.util.*;

public class setExample {

    public static void main(String[] args) {

        // set 객체 생성
        Set<String> set = new HashSet<>();

        // set에 객체 추가 : add()
        set.add("닭강정");
        boolean b1 = set.add("김말이");
        set.add("단무지");
        set.add("김말이");
        boolean b2 = set.add("김말이");
        System.out.println(b1);
        System.out.println(b2);

        // set에 저장된 객체 수 확인 : size()
        System.out.println("set에 저장된 객체 수 : " + set.size());
        System.out.println(set);

        // set의 반복문 처리
        System.out.println("==========================");
        for (String food : set) {
            System.out.println(food);
        }

        // set 내부 객체 삭제 : remove(객체)
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
