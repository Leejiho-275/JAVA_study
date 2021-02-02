package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int count1 = 0, count2 = 0;
        while (true) {
            int ranNum1 = (int) (Math.random() * 100) + 1;
            int ranNum2 = (int) (Math.random() * 100) + 1;
            int markNum = (int) (Math.random() * 3);
            int res;
            String mark;
            switch (markNum) {
                case 0:
                    mark = "+";
                    res = ranNum1 + ranNum2;
                    break;
                case 1:
                    mark = "-";
                    res = ranNum1 - ranNum2;
                    break;
                case 2:
                    mark = "x";
                    res = ranNum1 * ranNum2;
                    break;
                default:
                    mark = "";
                    res = 0;
            }

            System.out.println("-----------------");
            System.out.printf("%d %s %d = ?\n", ranNum1, mark, ranNum2);
            System.out.print("> ");
            input = sc.nextInt();
            if (input == res) {
                System.out.println("정답입니다!");
                count1++;
            } else if (input == 0) {
                System.out.println("입력 종료!");
                System.out.println("================");
                System.out.printf("정답횟수 : %d회\n오답횟수 : %d회", count1, count2);
                break;
            } else {
                System.out.println("오답입니다.");
                count2++;
            }
        }
        sc.close();
    }
}
