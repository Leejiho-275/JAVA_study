package day06;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void printMulti(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    static void greeting(String nickName) {
        if (nickName.equals("멍청이")) {
            System.out.println("부를 수 없는 별명입니다.");
            return;
        }
        System.out.println(nickName + "님 안녕하세요!");
    }

    //    모든 메서드는 리탄값을 하나만 리턴할 수 있음
    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        int result = add(10, 20);

//        리턴 타입이 void인 메서드는 변수에 저장 불가능
//        반드시 단독 호출해서 사용할 것
        printMulti(5, 6);

        greeting("멍청이");

        int[] datas = operateAll(20, 5);
        System.out.println("덧셈결과 : " + datas[0]);
        System.out.println("곱셈결과 : " + datas[2]);
    }
}
