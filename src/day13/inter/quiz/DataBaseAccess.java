package day13.inter.quiz;

public interface DataBaseAccess {

    //    db에 데이터 삽입기능
    void insert();

    //    db에 데이터 수정기능
    void update();

    //    db에 데이터 삭제기능
    void delete();

    //    db에 데이터 조회기능
    void select();
}
