import java.util.Scanner;
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n, revnum = 0;
        while(temp > 0){
            int lastDigit = temp % 10;
            temp = temp / 10;
            revnum = revnum * 10 + lastDigit;
        }
        if(n == revnum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
