public class Recursive {

    static int fib(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fib(a - 1) + (fib(a - 2));
        }
    }

    public static void main(String args[]) {
        System.out.println(fib(10));
    }
}
