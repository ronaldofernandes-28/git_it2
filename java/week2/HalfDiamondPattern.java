import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // First Half
        System.out.println("*");
        int i = 1;
        while (i <= n) {
            System.out.print("*");
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            j -= 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }

        // Second Half
        i = 1;
        while (i <= n - 1) {
            System.out.print("*");
            int j = 1;
            while (j <= n - i) {
                System.out.print(j);
                j++;
            }
            j -= 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }
        System.out.print("*");
    }
}
