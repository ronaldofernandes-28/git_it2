import java.util.Scanner;

public class CheckPrime {
    static boolean isPrime(int n){
        // If n is less than 2, it is not prime
        if (n < 2){
            return false;
        }
        // If n is 2 or 3, it is prime
        if(n == 2 || n == 3){
            return true;
        }
        // If n is divisible by 2 or 3, it is not prime
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        // Check if n has any divisor of the form 6k + 1 or 6k - 1
        for(int i = 5; i <= Math.sqrt(n); i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        // If no divisor is found, n is prime
        return true;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Close the scanner object
        sc.close();
        if(isPrime(n)){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
        int div = 2;
        boolean isPrime = true;
        while(div <= n/2){ // div < n-1
            if(n % div == 0){
                // System.out.println("Composite");
                isPrime =  false;
                return; // exit from main
            }
            /* else{
                System.out.println("Prime");
            } */
            div += 1;
            if(isPrime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Composite");
            }
        } 
    }
}
