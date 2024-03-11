import java.util.Scanner;

public class printFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // If n is negative, print an error message and return
        if (n < 0) {
            System.out.println("Invalid input. Please Enter a non-negative integer.");
        }
        // Initialize the first two Fibonacci numbers as 0 and 1
        int a = 0;
        int b = 1;
        // Print the first Fibonacci number
        System.out.println(a + " ");
        // Loop until the next Fibonacci number is greater than n
        while (a + b <= n) {
            // Calculate the next Fibonacci number as the sum of the previous two
            int c = a + b;
            // Print the next Fibonacci number
            System.out.println(c + " ");
            // Update the previous two Fibonacci numbers
            a = b;
            b = c;
        }
        System.out.println();
    }
}
