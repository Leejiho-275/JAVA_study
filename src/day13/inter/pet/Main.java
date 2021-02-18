package day13.inter.pet;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet bull = new BullDog();

        Pet[] pets = {dog, cat, bull};
        for (Pet pet : pets) {
            pet.play();
            pet.eat();
        }
    }
}
