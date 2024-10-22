class Parent {
    // Parent class constructor
    Parent() {
        this("Parent class constructor called");
        System.out.println("Default constructor of Parent");
    }

    // Overloaded constructor in Parent class
    Parent(String message) {
        System.out.println(message);
    }
}

class Child extends Parent {
    // Child class constructor
    Child() {
        this("Child class constructor called");
        System.out.println("Default constructor of Child");
    }

    // Overloaded constructor in Child class
    Child(String message) {
        super(message);
        System.out.println(message);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        new Child();  // Constructor chaining will occur
    }
}
