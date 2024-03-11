import java.util.Scanner;
public class NumberStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numstars = 0;
        sc.close();
        for(int i = 0; i< n; i++){
            for(int value = 1; value<= n- i  + 1; value++ ){
                System.out.print(value);
            }
            for(int star = 1; star <= numstars; star++){
                System.out.print("*");
            }
            for(int value = n - i + 1; value >= 1;  value--){
                System.out.print(value);
            }
            System.out.println();
            numstars += 2; 
        }
    }    
}
