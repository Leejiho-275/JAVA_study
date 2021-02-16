package day10.static_.singleton;

public class Main {

    public static void main(String[] args) {

        DbConnection connection1 = DbConnection.getConnection();
        DbConnection connection2 = DbConnection.getConnection();
        DbConnection connection3 = DbConnection.getConnection();

        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);

    }
}
