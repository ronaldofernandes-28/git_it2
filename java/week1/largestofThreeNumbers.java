// A program to find and print the largest of three numbers entered by the user
// Import the Scanner class to get user input
import java.util.Scanner;
public class largestofThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream
        Scanner sc = new Scanner(System.in);
        // Read the three numbers from the user and store them in variables
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // Close the Scanner object to avoid memory leaks
        sc.close();
        // Declare a variable to store the largest number
        int largest;
        // if(num1 >= num2 && num1 >= num3)
        // {
        //     largest = num1;
        // }
        // else if(num2 >= num1 && num2 >= num3){
        //     largest = num2;
        // }
        // else{
        //     largest = num3;
        // }
        // Compare the three numbers using the ternary operator and assign the largest one to the variable
        largest = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);
        // Print the largest number using string concatenation
        System.out.println("The largest Number is:" + largest);
    }
}
