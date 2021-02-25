package day18.api.io.stream;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        String filePath = "D:\\Developing_ljh\\iotest\\test.txt";

        InputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            while (true) {
                int data = fis.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        } finally {
            // 자원 해제
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
