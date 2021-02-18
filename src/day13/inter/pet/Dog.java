package day13.inter.pet;

public class Dog implements Pet {

    String name;
    int age;

    public void play() {
        System.out.println("강아지는 마당에서 놀아요");
    }

    public void eat() {
        System.out.println("강아지는 사료를 먹어요");
    }
}
