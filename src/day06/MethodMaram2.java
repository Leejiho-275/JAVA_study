package day06;

public class MethodMaram2 {

    //    n개의 정수의 합을 구하는 메서드
    static int addAll(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {

        int[] datas = {1, 7, 8, 19, 15, 3};
        int result = addAll(datas);
        System.out.println("result = " + result);

        int result2 = addAll(new int[]{10, 20, 30});
        System.out.println("result2 = " + result2);

        int result3 = addAll2(100, 200, 500, 1000);
        System.out.println("result3 = " + result3);
    }

    static int addAll2(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

}
