import java.util.Scanner;
public class AllPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 2; i < n; i++){
            boolean IsPrime = true;
            for(int j = 2; j < i ; j++){
                if(i % j == 0){
                    IsPrime = false;
                    break;
                }
            }
            if(IsPrime){
                System.out.println(i);                
            }
        }
    }
}
