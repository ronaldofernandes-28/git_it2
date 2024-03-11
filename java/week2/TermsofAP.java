import java.util.Scanner;
public class TermsofAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); 
        int current = 1;
        for(int count = 1; count<= n; count++){
            int num = 3 * current + 2;
            if(num % 4 != 0){
                System.out.println(num + " ");
            }
            else{
                count--;
            }
            current++;
        }
    }
}
