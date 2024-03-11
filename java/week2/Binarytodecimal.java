import java.util.Scanner;
public class Binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int dec = 0, pow = 1;
        for(; n > 0;){
            int last = n % 10;
            dec += last * pow;
            pow *= 2;
            n = n / 10;
        }
        System.out.println(dec);
    }
}
