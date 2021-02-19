package day14.api.lang.string;

import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "hello java";

        char c = s1.charAt(4);
        System.out.println("4번 인덱스 문자값 : " + c);

        String result = s1.substring(6); // 6번인덱스부터 끝까지 잘라냄
        System.out.println(result);

        result = s1.substring(0, 5);
        System.out.println(result);

        int len = s1.length();
        System.out.println("총 글자수 : " + len);

        int idx = s1.indexOf("o");
        System.out.println("o의 인덱스 : " + idx);

        idx = s1.indexOf("java");
        System.out.println("java의 첫글자 인덱스 : " + idx);

        idx = s1.indexOf("fds");
        System.out.println("없는 글자의 인덱스 : " + idx);

        System.out.println("l의 위치(앞에서부터) : " + s1.indexOf("l"));
        System.out.println("l의 위치(뒤에서부터) : " + s1.lastIndexOf("l"));

        System.out.println("========================");

        String fileName = "/upload/2021/02/19/야옹이는_못말려.JPG";
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("확장자명 : " + ext);

        switch (ext) {
            case "jpg":
            case "gif":
            case "png":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("기타 파일입니다.");
        }

        String greeting = "HELLo My WORld";
        System.out.println("=====================");
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        String name = "                김철수                  ";
        System.out.println(name.trim() + "님 안녕하세요!");

        String java = "java study, java program, java coffee";
        System.out.println(java.replace("java", "자바"));
        System.out.println(java.replace("java ", ""));

        String pet = "멍멍이, 야옹이, 어흥이, 짹짹이";
        String[] pets = pet.split(", ");
        System.out.println(Arrays.toString(pets));

        int x = 100;
        double y = 55.89;

        System.out.println(x + y);
        System.out.println(String.valueOf(x) + String.valueOf(y));
    }
}
