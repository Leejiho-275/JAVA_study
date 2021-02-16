package day11.final_.field;

public class Korean {

    public String name;

    //    상수 : 유일하고 불변한 값
    public static final String NATION = "대한민국";

    public final String password; // 주민번호

    public Korean(String password) {
        this.password = password;
    }
}
