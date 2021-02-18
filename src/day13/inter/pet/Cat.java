package day13.inter.pet;

public class Cat implements Pet{

    String name;
    int age;

    public void play() {
        System.out.println("고양이는 장난감이랑 놀아요~");
    }

    public void eat() {
        System.out.println("고양이는 생선을 먹어요~");
    }
}
