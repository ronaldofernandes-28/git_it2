import java.util.Scanner;

public class SumofProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        sc.close();
        if(choice == 1){
            int sum = 0;
            for(int num = 1; num <= n; num++){
                sum += num;
            }
            System.out.println(sum);
        }
        else if(choice == 2){
            int prod = 1;
            for(int num = 1; num <= n; num++){
                prod *= num;
            }
            System.out.println(prod);
        }
        else{
            System.out.println("-1");
        }
    }
}
