import java.util.Scanner;
public class Maximumnumber {
    public static int max_number(int n){
        int max = 0;
        for(int i = 1; n / i >0; i *= 10){
            int new_num = (n / (i * 10)) * i + n % i;
            if(max < new_num){
                max = new_num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(max_number(n));

    }
}
