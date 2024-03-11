import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int p = 1;
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(p);
                p++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
