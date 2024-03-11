import java.util.Scanner; // Import the Scanner class

public class AverageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object to read input

        // Input
        String name = s.nextLine(); // Read the next line of input as a string and store it in the variable 'name'
        int m1 = s.nextInt(); // Read the next integer of input and store it in the variable 'm1'
        int m2 = s.nextInt(); // Read the next integer of input and store it in the variable 'm2'
        int m3 = s.nextInt(); // Read the next integer of input and store it in the variable 'm3'

        s.close(); // Close the Scanner object after use to prevent resource leaks

        // Processing
        int average = (m1 + m2 + m3) / 3; // Calculate the average of 'm1', 'm2', and 'm3' and store it in the variable 'average'

        // Output
        System.out.println(name); // Print the value of 'name' to the console
        System.out.println(average); // Print the value of 'average' to the console
    }
}
