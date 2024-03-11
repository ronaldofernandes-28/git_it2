// A program to check and print whether three numbers entered by the user can form a valid triangle
// Import the Scanner class to get user input
import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream
        Scanner sc = new Scanner(System.in);
        // Read the three numbers from the user and store them in variables
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        // Close the Scanner object to avoid memory leaks
        sc.close();
        // Check if the sum of any two sides is greater than the third side using the triangle inequality theorem
        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
