import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= i - 1){
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while(j <= n){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
