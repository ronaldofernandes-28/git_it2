import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n- i){
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while(stars <= i){
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
}
