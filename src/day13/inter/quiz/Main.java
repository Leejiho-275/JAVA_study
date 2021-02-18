package day13.inter.quiz;

public class Main {

    public static void work(DataBaseAccess dba){
        dba.select();
        dba.insert();
        dba.update();
        dba.delete();
        System.out.println("========================");
    }

    public static void main(String[] args) {
        work(new OracleDB());
        work(new MariaDB());
    }
}
