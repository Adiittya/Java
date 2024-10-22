import java.util.Scanner;

interface Animal {

    public void AnimalName();

    public void AnimalType();

}

class Dog implements Animal {

    public void AnimalName() {
        System.out.print("DOg");
    }

    public void AnimalType() {
        System.out.print("barks");
    }

}

public class Interface {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.AnimalName();
    }
}
