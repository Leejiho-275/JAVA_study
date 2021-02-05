package day06;

public class MethodQuiz2 {

    static double[] calcArrayTotal(int[] num) {
        int total = 0;
        for (int n : num) {
            total += n;
        }

        return new double[]{(int) total, (double)total / (double)num.length};
    }

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점 : %d점, 평균 : %.2f점\n", (int) arrTotAvg[0], arrTotAvg[1]);
    }
}
