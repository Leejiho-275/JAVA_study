package day03;

public class ForQuiz {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 8) + 2;
        for (int count = 1; count < 10; count++) {
            System.out.printf("%d x %d = %d\n", num, count, num * count);
        }
    }
}
