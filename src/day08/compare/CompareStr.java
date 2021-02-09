package day08.compare;

import java.util.Scanner;

public class CompareStr {

    public static void main(String[] args) {

//        사람 객체 생성
        Person kim = new Person("김철수", "5544");
        System.out.println("kim의 pw : " + kim.pw);

//        새로운 비밀번호를 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호 : ");
        String inputPw = sc.next();
        sc.close();

        System.out.println("== 비교 : " + (kim.pw == inputPw));
        System.out.println("equals 비교 : " + (kim.pw.equals(inputPw)));
    }
}
