import java.util.Scanner;
public class CheckPrime {
    public static boolean checkPrime(int n){
        int div = 2;
        while(div <= n/2){
            if(n % 2 == 0){
                // not prime
                return false;
            }
            div++;
        }
        return true;
    }

     public static boolean checkPrime2(int n){
        int div = 2;
        boolean isPrime = true;
        while(div <= n/2){
            if(n % 2 == 0){
                // not prime
                isPrime = false;
                break;
            }
            div++;
        }
        /* if(isPrime){
            return true;
        }
        else{
            return false;
        } */
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(checkPrime(n)){
            System.out.println("prime");
        }
        else{
            System.out.println("Composite Number");
        }
        boolean isPrime = checkPrime(n);
        System.out.println(isPrime);
        boolean isPrime2 = checkPrime2(n);
        System.out.println(isPrime2);

    }
}
