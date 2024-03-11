import java.util.Scanner;

// The AddTwoNumbers class represents a simple Java program that reads various types of input from the user.
class AddTwoNumbers{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        // Declare variables
        int a, b, c;
        double e;
        long l;
        // Read a string till the end of the line
        String str = sc.nextLine();
        // Read a string till the first space
        String str1 = sc.next();
        // Read the first character of the string
        char ch = str1.charAt(0);
        // Print the character and strings
        System.out.println(ch);
        System.out.println(str);
        System.out.println(str1);
        // Read two integers and add them
        a = sc.nextInt(); // First number
        b = sc.nextInt(); // Second number
        c = sc.nextInt(); // Third number
        int d = a + b;
        // Calculate the average
        int f = a + b+ c;
        // Print the sum
        System.out.println(d);
        System.out.println("The calculated average is: " + f);
        // Read a double and a long
        e = sc.nextDouble();
        l = sc.nextLong();
        // Close the scanner
        

        // This class represents a simple interest calculator.
        // Calculates the simple interest based on the given principal amount, rate of interest and time.
        double principal = sc.nextDouble(); // Principal amount
        double rate = sc.nextDouble(); // Rate of interest
        double time = sc.nextDouble(); // Time period

        // Calculate the simple interest
        double simpleInterest = principal * rate * time / 100;

        System.out.println("The calculated Simple Interest is: " + simpleInterest);
        sc.close();
    }
}