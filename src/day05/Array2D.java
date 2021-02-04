package day05;

public class Array2D {
    public static void main(String[] args) {

//        2차원 배열 값 목록으로 생성
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr2d.length);
        System.out.println(arr2d[1][1]);

        System.out.println("=======================");
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

//        객체 생성문으로 2차원배열 생성
        String[][] sArr2d = new String[3][4];

        sArr2d[1][1] = "햄버거";
        sArr2d[2][2] = "피자";
        for (String[] sArr : sArr2d) {
            for (String s : sArr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
