package day11.poly.car;

public class Driver {

    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }

    public Car buyCar(String carName) {

        if (carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("K5")) {
            System.out.println("K5를 구매합니다.");
            return new K5();
        } else if (carName.equals("Malibu")) {
            System.out.println("Malibu를 구매합니다.");
            return new Malibu();
        } else {
            System.out.println("없는 차량입니다.");
        return null;
        }
    }
}
