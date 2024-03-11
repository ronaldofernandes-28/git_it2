import java.util.Scanner;
public class CheckNumbersequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        
        
        int count = 2;
        boolean isDec = true;
        while(count <= n){
            int cur = sc.nextInt();
            count++;
            if(cur == prev){
                System.out.println("False");
                return;
            }
            else if(cur < prev){
                if (isDec == false){
                    System.out.println("False");
                    return;
                }

            }
            else{
                if(!isDec){
                    isDec = false;
                    sc.close();
                }
            }
            prev = cur;
        }
        System.out.println("True");
    }

}
