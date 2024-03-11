import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                if (j == i) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                j++;
            }
            System.out.println(sum);
            i++;
        }
    }
}