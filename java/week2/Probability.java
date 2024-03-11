import java.util.Scanner;

public class Probability {
    public static long fact(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long ncr(int n, int x){
        return fact(n)/(fact(n - x)* fact(x));
    }
    public static int probability(int n , int x){
        long ans = ncr(4,x) * ncr(4, n-x);
        double probability = ans * 1.0/ncr(8, n);
        return (int) (probability * 100);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        System.out.println(probability(n, x));
    }
}