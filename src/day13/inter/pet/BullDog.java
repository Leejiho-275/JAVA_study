package day13.inter.pet;

public class BullDog extends Dog implements Pet, Huntable {
    @Override
    public void play() {
        System.out.println("불독은 사납게 짖으며 놀아요");
    }

    @Override
    public void eat() {
        System.out.println("불독은 고기를 먹어요");
    }

    @Override
    public void hunt() {
        System.out.println("불독은 이빨로 사냥해요");
    }
}
