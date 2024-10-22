import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions (length and breadth) of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of the class Area
        Area rectangle = new Area();

        // Taking user input for length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Setting the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculating and displaying the area
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
