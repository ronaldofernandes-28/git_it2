import java.util.Scanner;
public class NcR {
    public static long fact(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static long ncr(int n, int r){
        long factN1 = fact(n);
        long result;
        // long factN1 = fact(10); ok
        long factR1 = fact(r);
        long factNR1 = fact(n - r);
        return result = factN1 / (factR1 * factNR1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int factN = 1;
        for(int i = 1; i <= n; i++){
            factN *= i;
        }
        int factR = 1;
        for(int i = 1; i <= r; i++){
            factR *= i;
        }
        int factNR = 1;
        for(int i = 1; i <= n - r; i++){
            factNR *= i;
        }
        long result = ncr(n, r);
        System.out.println(result);
        


        
        // long result1 = factN1 / (factR1 * factNR1);
        // System.out.println(result1);
    }
    
}
