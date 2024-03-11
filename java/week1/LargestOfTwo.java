import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        /* if (a > b) {
            System.out.println("First number is greater");
        } else {
            if (b > a) {
                System.out.println("Second number is greater");
            } else {
                System.out.println("Both are equal");
            }
        } */

        if (a > b) {
            System.out.println("First number is greater");
        } else if (b > a) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }
        System.out.println("Outside if else");
    }
}
