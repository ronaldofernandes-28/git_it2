import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        // Calculate the sum of even numbers from 1 to N
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers from 1 to " + n + " is " + sum);
    }
}
