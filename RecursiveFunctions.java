import java.util.*;

public class RecursiveFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Recursive Functions Menu =====");
            System.out.println("1. Find GCD and LCM");
            System.out.println("2. Print Fibonacci numbers");
            System.out.println("3. Find reverse of a number");
            System.out.println("4. Sum series (1+2+3+...+n)");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // GCD and LCM
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("GCD: " + gcd(a, b));
                    System.out.println("LCM: " + (a * b) / gcd(a, b));
                    break;

                case 2:
                    // Fibonacci series
                    System.out.print("Enter the number of terms: ");
                    int n = scanner.nextInt();
                    System.out.print("Fibonacci series: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    // Reverse number
                    System.out.print("Enter a number to reverse: ");
                    int num = scanner.nextInt();
                    System.out.println("Reversed number: " + reverse(num));
                    break;

                case 4:
                    // Sum series
                    System.out.print("Enter n: ");
                    n = scanner.nextInt();
                    System.out.println("Sum of series: " + sumSeries(n));
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }

    // Recursive GCD function
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Recursive Fibonacci function
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive function to reverse a number
    static int reverse(int num) {
        int digits = (int) Math.log10(num);
        return reverseHelper(num, digits);
    }

    static int reverseHelper(int num, int digits) {
        if (num == 0) return 0;
        return (num % 10) * (int) Math.pow(10, digits) + reverseHelper(num / 10, digits - 1);
    }

    // Recursive function to find sum of the series
    static int sumSeries(int n) {
        if (n == 0) return 0;
        return n + sumSeries(n - 1);
    }
}
