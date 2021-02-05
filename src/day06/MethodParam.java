package day06;

public class MethodParam {

    //    x ~ y의 총합을 구해주는 메서드 정의
    static int calcRangeTotal(int begin, int end) {
        int total = 0;
        for (int n = begin; n <= end; n++) {
            total += n;
        }
        return total;
    }

    static String selectRandomFood() {
        String[] foods = {"치킨", "피자", "족발", "삼겹살", "파스타"};
        int rn = (int) (Math.random() * foods.length);
        return foods[rn];
    }

    public static void main(String[] args) {

        int result = calcRangeTotal(4, 7);
        System.out.println("result = " + result);

        System.out.println(selectRandomFood());
    }

}
