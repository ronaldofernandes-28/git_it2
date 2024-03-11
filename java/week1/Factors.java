import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 2;
        boolean a = false;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
                a = true;
            }
            i++;
        }
        if (a == false) {
            System.out.println("-1");
        }
    }
}
