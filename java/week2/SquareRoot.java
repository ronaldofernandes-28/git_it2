import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int output = 0;
        while(output * output <= n){
            output++;
        }
        System.out.println(--output);
    }
}
