package day06;

/*
#메서드 (method)
1. 메서드는 코드의 모듈화
2. 메서드는 정의하는 과정과 호출하는 과정으로 나누어짐
3. 메서드 정의는 메서드 내부에서는 불가능
   새로운 메서드를 정의할 때는 반드시 메서드 블록 외부, 클래스 블록 내부에서만 가능
4. 메서드를 정의했으면 호출을 통해 사용
   메서드 호출은 메서드 내부, 생성자 내부에서만 가능
*/

public class MethodBasic {

    //    두 개의 정수의 합을 구하는 메서드 정의
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {

//        메서드 호출
        int result = add(10, 20);

    }

}
