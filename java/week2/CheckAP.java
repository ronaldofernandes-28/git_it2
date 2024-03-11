import java.util.Scanner;
public class CheckAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int current = sc.nextInt();
        int count = 3;
        int d = current - prev;
        prev = current;
        while(count<= n){
            current = sc.nextInt();
            int tempD = current - prev;
            if(tempD != d){
                System.out.println("false");
                sc.close();
                return;
            }
            count++;
            prev = current;
        }
        System.out.println("true");
        sc.close();
    }
}
