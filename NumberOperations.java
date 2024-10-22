import java.util.Scanner;

public class NumberOperations {

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        if (n < 0) return -1; // Factorial is not defined for negative numbers
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to test if a number is an Armstrong number
    public static boolean testArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, digits);
            num /= 10;
        }
        return result == originalNum;
    }

    // Method to test if a number is a palindrome
    public static boolean testPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    // Method to test if a number is a prime number
    public static boolean testPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to print Fibonacci series up to n terms
    public static void fibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Menu-driven interface
        while (!exit) {
            System.out.println("\n===== Number Operations Menu =====");
            System.out.println("1. Factorial");
            System.out.println("2. Test Armstrong Number");
            System.out.println("3. Test Palindrome");
            System.out.println("4. Test Prime Number");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Factorial calculation
                    System.out.print("Enter a number to find factorial: ");
                    int num = scanner.nextInt();
                    long fact = factorial(num);
                    if (fact == -1) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Factorial of " + num + " is " + fact);
                    }
                    break;

                case 2:
                    // Test Armstrong number
                    System.out.print("Enter a number to check if it's an Armstrong number: ");
                    num = scanner.nextInt();
                    if (testArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number.");
                    } else {
                        System.out.println(num + " is not an Armstrong number.");
                    }
                    break;

                case 3:
                    // Test Palindrome number
                    System.out.print("Enter a number to check if it's a palindrome: ");
                    num = scanner.nextInt();
                    if (testPalindrome(num)) {
                        System.out.println(num + " is a palindrome.");
                    } else {
                        System.out.println(num + " is not a palindrome.");
                    }
                    break;

                case 4:
                    // Test Prime number
                    System.out.print("Enter a number to check if it's a prime number: ");
                    num = scanner.nextInt();
                    if (testPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;

                case 5:
                    // Fibonacci Series
                    System.out.print("Enter number of terms for Fibonacci series: ");
                    int n = scanner.nextInt();
                    fibonacciSeries(n);
                    break;

                case 6:
                    // Exit the application
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid option! Please select a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}
