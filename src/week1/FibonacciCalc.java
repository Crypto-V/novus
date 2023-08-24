package week1;

public class FibonacciCalc {

    public static void main(String[] args) {
        int size = 100; //This is the number of items to be printed, adjust if necessary.
        System.out.println("Iterative method starts here");
        fibonacci(size);

        System.out.println("\nRecursive method starts here!");

        System.out.print("0, 1, ");
        recursiveFibonacci(size - 2, 0, 1);
    }

    private static void fibonacci(int size) {

        int first = 0;
        int second = 1;
        int sum;

        while (size != 0) {
            sum = first + second;
            System.out.print(first + ", ");
            first = second;
            second = sum;
            size--;
        }
    }

    private static void recursiveFibonacci(int size, int num1, int num2) {

        if (size > 0) {

            // get next fibonacci number by summing
            int sum = num1 + num2;
            System.out.print(sum + ", ");

            // call recursive method to print next fibonacci number
            recursiveFibonacci(size - 1, num2, sum);
        }
    }
}
