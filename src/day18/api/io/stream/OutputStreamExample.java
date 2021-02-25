package day18.api.io.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OutputStreamExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("파일명을 입력 : ");
        String fileName = sc.next();

        String filePath = "D:\\Developing_ljh\\iotest\\" + fileName + ".txt";

        OutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);

            System.out.println("문장 입력 : ");
            sc.nextLine();
            String str = sc.nextLine();
//            String str = "I am a student! hello my friend!";

            // write메서드는 오직 바이트데이터만 쓸 수 있음
            // 따라서 String을 파일에 쓸려면 바이트로 변환해야 함
            fos.write(str.getBytes());

            System.out.println("파일이 정상 저장되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
