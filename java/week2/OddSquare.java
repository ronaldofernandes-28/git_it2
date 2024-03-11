import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <= n) {
            int x = 2 * i - 1;
            int j = 1;
            while (j <= n) {
                System.out.print(x);
                x += 2;
                int maxValue = 2 * n - 1;
                if (x > maxValue) {
                    x = 1;
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
