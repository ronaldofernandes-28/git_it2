import java.util.Scanner;

public class Diamondofstars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int n1 = (n + 1) / 2;
        while (i <= n1) {

            int spaces = 1;
            while (spaces <= n1 - i) {
                System.out.print(' ');
                spaces++;
            }
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
        int n2 = n - n1;
        i = n2;
        while (i >= 1) {
            int spaces = 1;
            while (spaces <= (n2 - i) + 1) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println();
        }
    }
}
