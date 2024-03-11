import java.util.Scanner;

public class isFibonacci {
    public static void main(String[] args) {
        // Read a non-negative integer from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // If n is negative, return false
        if (n < 0) {
            System.out.println("Invalid input. Please Enter a non-negative integer.");
        }
        // Initialize the first two Fibonacci numbers as 0 and 1
        int a = 0;
        int b = 1;
        // Loop until the next Fibonacci number is greater than or equal to n
        while (a + b < n) {
            // Calculate the next Fibonacci number as the sum of the previous two
            int c = a + b;
            // Update the previous two Fibonacci numbers
            a = b;
            b = c;
        }
        // Return true if n is equal to the next Fibonacci number, false otherwise
        // If the current Fibonacci number is equal to
        // N, it is a Fibonacci number
        if (a + b == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // If the current Fibonacci number is greater
        // than N, it is not a Fibonacci number
    }
}
