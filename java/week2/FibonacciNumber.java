import java.util.Scanner;
public class FibonacciNumber {
    public static boolean checkfibonacci(int n){
        int a = 0;
        int b = 1;
        while(a < n){
            int c = a + b;
            a = b;
            b = c;
        }
        if(a == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(checkfibonacci(n));
    }
}
