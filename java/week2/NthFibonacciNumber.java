import java.util.Scanner;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
