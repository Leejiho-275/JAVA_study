package day18.api.io.rw;

import java.io.*;

public class FileWriterExample {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\Developing_ljh\\iotest\\텍스트저장연습.txt");

            String str = "i want go to sleep \r\n i want go home";
            fw.write(str);
            System.out.println("파일을 정상 저장했습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
