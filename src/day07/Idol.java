package day07;

import java.util.Arrays;

//설계용 클래스 : 객체를 만들기 위한 용도
//설계용 클래스에는 main메서드를 만들지 않음
public class Idol {

//    클래스 내부에는 객체의 속성과 기능을 정의
//    객체의 속성들을 필드라고 부름

    //    상태 데이터
    String teamName;
    int memberNumber;
    String[] memberNames;

    //    부품 데이터
    Album[] album;

    //    객체의 기능들을 메서드라고 부름
//    설계용 메서드는 static을 붙이지 마세요
    void sing() {
        System.out.println(teamName + "이(가) 노래합니다.");
    }

    void dance() {
        System.out.println(teamName + "이(가) 춤을 춥니다.");
    }

    void introduce() {
        System.out.printf("안녕하세요~ 저희는 %s입니다. %d인조 그룹입니다." + "\n멤버들은 %s들입니다.\n", teamName, memberNumber, Arrays.toString(memberNames));
    }

}
