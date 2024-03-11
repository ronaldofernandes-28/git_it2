import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int num = i;

            /* int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int temp = i;
            while (j <= i) {
                System.out.print(temp);
                temp++;
                j++;
            }
            temp--;
            int k = 1;
            while (k < i) {
                temp--;
                System.out.print(temp);
                k++;
            }
            i++;
            System.out.println(); */

            while (j <= n + i - 1) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else if (j < n) {
                    System.out.print(num);
                    num++;
                } else {
                    System.out.print(num);
                    num--;
                }
                j++;
            }
            i++;
            System.out.println();

        }

    }
}
