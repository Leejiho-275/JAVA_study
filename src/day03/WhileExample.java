package day03;

public class WhileExample {
    public static void main(String[] args) {
        /*
        int i = 48;
        while (i <= 150) {
            System.out.print(i + " ");
            i += 8;
        }
        */
        for (int i = 48; i <= 150; i += 8) {
            System.out.print(i + " ");
        }

        System.out.println();
//        1~100사이의 정수중 4의 배수를 출력
        /*
        int j = 1;
        while (j <= 100) {
            if (j % 4 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        */
        for (int j = 1; j <= 100; j++) {
            if (j % 4 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
