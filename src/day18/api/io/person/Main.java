package day18.api.io.person;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김철수", 30, "대전시");
        saveData(kim);
        kim = null;

        Person loadedPerson = loadData();
        System.out.println("===== 로딩된 Person 정보 =====");
        System.out.println(loadedPerson);
    }

    private static Person loadData() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Developing_ljh\\iotest\\person.sav");
            // 객체를 파일에 저장하려면 보조스트림 ObjectInputStream을 사용
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 객체를 세이브 파일로부터 불러옴
            Person data = (Person) ois.readObject();
            return data;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static void saveData(Person person) {

        OutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Developing_ljh\\iotest\\person.sav");
            // 객체를 파일에 저장하려면 보조스트림 ObjectOutputStream을 사용
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 객체 세이브 파일에 저장
            // 객체를 저장하려면 직렬화를 수행해야 함! 직렬화는 Person클래스로 가서
            oos.writeObject(person);

            System.out.println("파일 저장 성공");

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

