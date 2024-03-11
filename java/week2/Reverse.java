import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int revNum = 0;
        for(int temp = n; temp>0;){
            int lastDigit = temp % 10;
            revNum = revNum * 10 + lastDigit;
            temp /= 10;
        }
        System.out.println(revNum);
    }
}
