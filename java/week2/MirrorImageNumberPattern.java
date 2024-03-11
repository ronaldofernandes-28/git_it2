import java.util.Scanner;
public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while(i <= n){
            int j = 1;
            int spaces = 1;
            while(spaces <= n - i){
                System.out.print(" ");
                spaces++;
            }
            while(j < i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
