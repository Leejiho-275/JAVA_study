package day14.api.lang.obj;

public class Counter {

    private int num;

    //    생성자
    public Counter(int num) {
        this.num = num;
    }

    //    소멸자
    @Override
    protected void finalize() throws Throwable {
        System.out.println(num + "번 객체가 소멸됨!");
    }
}
