import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         int result = 1;
        if (n <0){
            throw new IllegalArgumentException("NUmber must be a non-negative integer.");
        }
       
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is " + result);
    }
}
