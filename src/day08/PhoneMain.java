package day08;

public class PhoneMain {
    public static void main(String[] args) {

//        객체 생성 방법
        Phone myPhone = new Phone();
//        myPhone.model = "갤럭시 s20";
//        myPhone.color = "코발트블루";
//        myPhone.price = 1000000;
        myPhone.powerOn();
        myPhone.showSpec();

        System.out.println("===================");
        Phone galaxy = new Phone("갤럭시 s20");
        galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("===================");
        Phone iPhone = new Phone("아이폰 X", "스노우 화이트");
        iPhone.powerOn();
        iPhone.showSpec();

        System.out.println("===================");
        Phone xhaomi = new Phone("샤오미", "에메랄드", 250000);
        xhaomi.powerOn();
        xhaomi.showSpec();

    }
}
