package day13.exception;

//사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception {

    //    에러 메시지를 전달하는 생성자
    public BalanceInsufficientException(String message) {
        super(message);
    }
}
