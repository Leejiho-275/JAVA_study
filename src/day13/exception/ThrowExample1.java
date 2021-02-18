package day13.exception;

public class ThrowExample1 {

    public static String[] greeting = {"안녕", "헬로", "사와디캅"};

    public static void greet1(int index) throws Exception {
        System.out.println("인사말 : " + greeting[index]);
    }

    public static void main(String[] args) {
        try {
            greet1(13);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 정상 종료");
    }
}
