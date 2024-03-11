import java.util.Scanner;
public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        char value = 'A';
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(value);
                j++;
            }
            value++;
            i++;
            System.out.println();
        }
    }
}
