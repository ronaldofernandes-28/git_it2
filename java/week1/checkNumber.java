// A program to check and print the sign of a number entered by the user
// Import the Scanner class to get user input
import java.util.Scanner;

public class checkNumber{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream
        Scanner sc = new Scanner(System.in);
        // Read the number from the user and store it in a variable
        int num = sc.next().charAt(0);
        // Close the Scanner object to avoid memory leaks
        sc.close();
        if(num > 0){
            System.out.println("1");
        }
        else if(num < 0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
}