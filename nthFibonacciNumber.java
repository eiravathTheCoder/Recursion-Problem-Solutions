public class nthFibonacciNumber {

    public static int getNthFibonacciNumber(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);

    }

    public static void main(String[] args) {

        System.out.println(getNthFibonacciNumber(5));

    }

}