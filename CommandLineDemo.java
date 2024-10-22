public class CommandLineDemo {
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("No command line arguments were passed.");
        } else {
            System.out.println("Number of arguments passed: " + args.length);

            // Print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
