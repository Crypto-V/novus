package week1;

import java.math.BigInteger;

public class FibonacciCalc {

    public static void main(String[] args) {
        int size = 100; // This is the number of items to be printed, adjust if necessary.
        System.out.println("Iterative method starts here");
        fibonacci(size);

        System.out.println("\nRecursive method starts here!");

        System.out.print("0, 1, ");
        recursiveFibonacci(size - 2, BigInteger.ZERO, BigInteger.ONE);
    }

    private static void fibonacci(int size) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        while (size != 0) {
            BigInteger sum = first.add(second);
            System.out.print(first + ", ");
            first = second;
            second = sum;
            size--;
        }
    }

    private static void recursiveFibonacci(int size, BigInteger num1, BigInteger num2) {
        if (size > 0) {
            BigInteger sum = num1.add(num2);
            System.out.print(sum + ", ");
            recursiveFibonacci(size - 1, num2, sum);
        }
    }
}
