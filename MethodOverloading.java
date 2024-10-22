class OverloadDemo {
    // Method with no parameters
    public void display() {
        System.out.println("Display method with no parameters");
    }

    // Overloaded method with one integer parameter
    public void display(int a) {
        System.out.println("Display method with one integer: " + a);
    }

    // Overloaded method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Display method with two integers: " + a + " and " + b);
    }

    // Overloaded method with one string parameter
    public void display(String message) {
        System.out.println("Display method with one string: " + message);
    }

    // Overloaded method with one double parameter
    public void display(double d) {
        System.out.println("Display method with one double: " + d);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        
        // Call the display method with no parameters
        obj.display();
        
        // Call the display method with one integer parameter
        obj.display(10);
        
        // Call the display method with two integer parameters
        obj.display(10, 20);
        
        // Call the display method with one string parameter
        obj.display("Hello, World!");
        
        // Call the display method with one double parameter
        obj.display(99.99);
    }
}
