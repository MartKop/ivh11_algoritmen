package Examples.Fibonacci;

public class main {
    public static void main(String[] args) {
        int n = 1000; //Integer.parseInt(args[0]);

        System.out.println("Starting...");
        long startTime = System.nanoTime();
        System.out.println(n + ": " + fibonacciRecursion(n));
        //System.out.println(n + ": " + fibonacciIterative(n));
        long endTime = System.nanoTime();
        System.out.println("Ending...");

        System.out.println("Time elapsed: " + String.valueOf((endTime - startTime)  ));


    }

    public static long fibonacciRecursion(int n) {
        if (n <= 1) return n;
        else return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    public static long fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}