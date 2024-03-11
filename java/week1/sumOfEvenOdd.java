import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int evenSum = 0, oddSum = 0;
        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            n /= 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
