package day17.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // map객체 생성
        Map<String, Object> map = new HashMap<>();

        // map에 객체 추가 : put(key, value);
        map.put("멍멍이", "박영희");
        map.put("야옹이", "김철수");
        map.put("까마귀", "홍길동");
        map.put("청소당번", new String[]{"박영희", "김철수"});

        System.out.println(map);

        map.put("야옹이", "고길동");
        System.out.println(map);

        // map에 저장된 객체 수 : size()
        System.out.println("map의 객체 수 : " + map.size());

        // map에 저장된 객체 참조 : get(key)
        String name = (String) map.get("까마귀");
        System.out.println("별명이 까마귀인 학생 : " + name);

        // map의 반복문 처리
        System.out.println("==============================fsd");
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        System.out.println("==============================");
        for (String key : map.keySet()) {
            Object value = map.get(key);
            if (value instanceof String) {
                System.out.println(key + " : " + value);
            } else if (value instanceof String[]) {
                System.out.println(key + " : " + Arrays.toString((String[]) value));
            }
        }

        // map에 내부 데이터 삭제 : remove(key)
        map.remove("까마귀");
        System.out.println(map);

        // map에 저장된 데이터 유무 확인 : containsKey(), containsValue()
        System.out.println(map.containsKey("까마귀"));
        System.out.println(map.containsKey("청소당번"));
        System.out.println(map.containsValue("김철수"));
        System.out.println(map.containsValue("고길동"));

        map.clear();
        System.out.println("isEmpty : " + map.isEmpty());


    }
}
