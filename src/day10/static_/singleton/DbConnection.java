package day10.static_.singleton;

/*
# 싱글톤 디자인 패턴
- 클래스의 객체 생성을 하나로 제한하기 위한 코드 디자인 패턴
*/
public class DbConnection {

    //    1. 외부에서 이 클래스의 객체를 생서할 수 없도록
//    생성자를 딱 한개만 선언한 뒤 private 제한함.
    private DbConnection() {
    }

    /*
    2. 생성자를 호출할 수 있는 영역은 자신의 클래스 내부뿐이므로
       자신의 클래스 내부에서 스스로의 객체를 1개 생성
    */
    private static DbConnection conn = new DbConnection();

    /*
    3. 외부에서 이 클래스의 객체생성을 요구할 경우
       2번에서 미리 만들어둔 단 하나의 객체를 메서드를 통해 반환.
    */
    public static DbConnection getConnection() {
        return conn;
    }
}
