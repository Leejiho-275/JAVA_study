package day09.encap.good;

public class Main {

    public static void main(String[] args) {

        Cat nabi = new Cat();

//        nabi.weight=-100;
        nabi.setWeight(-2000);

//        double nabiWeight=nabi.weight;
        double nabiWeightForPound = nabi.getWeight(true);
        double nabiWeightForKg = nabi.getWeight(false);

        nabi.printWeight();

    }
}
