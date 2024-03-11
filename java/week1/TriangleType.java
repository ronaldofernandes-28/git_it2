import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        // Check if the given side lengths form a valid triangle
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            // Determine the type of triangle
            if (a == b && b == c) {
                System.out.println("1");
            } else if (a == b || b == c || c == a) {
                System.out.println("0");
            } else {
                System.out.println("-1");
            }
        } else {
            System.out.println("Invalid triangle: Sum of any two sides must be greater than the third side");
        }

    }
}
