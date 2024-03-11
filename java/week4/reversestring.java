import java.util.Scanner;
public class reversestring {
    public static String ReverseString(String str){
        String ReversedString = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ReversedString += str.charAt(i);
        }
        return ReversedString;
    }
    public static String ReverseString1(String str){
        String ReversedString = "";
        for(int i = 0; i < str.length(); i++){
            ReversedString = str.charAt(i) + ReversedString;
        }
        return ReversedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ReverseString(str));
        System.out.println(ReverseString1(str));
        sc.close();
    }
}
