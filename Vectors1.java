import java.util.Scanner;
import java.util.Vector;

public class Vectors1 {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();  // Use generics for type safety
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            if (stringVector.contains(input)) {
                stringVector.remove(input);
                System.out.println("Removed: " + input);
            } else {
                stringVector.add(input);
                System.out.println("Added: " + input);
            }
        }

        System.out.println("Final vector: " + stringVector);
        scanner.close();
}
}