package day08;

//한 파일 안에서 여러 클래스를 만들 때는 파일명과 다른 클래스는
//public을 붙일 수 없음
class Test {

    int fVar; //필드 : 초기화하지 않으면 각 타입의 기본값으로 자동초기화

    void test(int pVar) { // 매개 변수
        int lVar = 10; // 지역 변수

//        각 변수 참조
        System.out.println("필드 : " + fVar);
        System.out.println("지역 : " + lVar);
        System.out.println("매개 : " + pVar);
    }

}

public class FieldAndLocal {
    public static void main(String[] args) {

        Test t = new Test();

        t.test(30);

    }
}
