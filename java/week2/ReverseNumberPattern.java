import java.util.Scanner;
public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while(i <= n){
            int j = 1;
            // int value = i;
            while(j <= i){
                // System.out.print(value);
                // value--;
                System.out.print(i - j + 1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
