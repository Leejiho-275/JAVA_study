package day14.api.lang.obj;

import java.util.Objects;

//Object의 clone메서드를 사용하려면 Cloneable이라는 인터페이스를 구현해야 함
public class Person extends Object implements Cloneable {

    String name;
    int age;
    Car car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person target = (Person) o;
            if (this.name.equals(target.name) && this.age == target.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "[정보] 이름 : " + name + ", 나이 : " + age + "세";
    }

    //    복제 메서드 (얕은 복사 : Person만 복제)
    public Person makeClone() throws CloneNotSupportedException {
        return (Person) this.clone();
    }

//    깊은 복사 : Object의 clone은 기본적으로 얕은복사를 수행
//    따라서 이를 재정의하여 깊은복사로 변경해야 함


    @Override
    protected Object clone() throws CloneNotSupportedException {
//        먼저 얕은 복사를 수행
        Person cloned = (Person) super.clone();
//        내부의 Car를 복사
        cloned.car = new Car(this.car.model);
//        깊은 복사가 완료된 복제본을 리턴
        return cloned;
    }
}
