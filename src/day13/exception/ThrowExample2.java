package day13.exception;

class Test {

    public Test() throws Exception {
        System.out.println("생성자 호출!");
        ccc();
    }

    private void aaa(int n) throws Exception {
        System.out.println("aaa 호출됨!");
        int r = 10 / n;
    }

    private void bbb(int n) throws Exception {
        System.out.println("bbb 호출됨!");
        aaa(n);
    }

    private void ccc() throws Exception {
        System.out.println("ccc 호출됨!");
        bbb(0);
    }
}

public class ThrowExample2 {

    public static void main(String[] args) {
        try {
            new Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
