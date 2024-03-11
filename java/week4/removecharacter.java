import java.util.Scanner;

public class removecharacter {
    public static String removeAllOccurancesOfChar(String str, char ch) {
        int n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ch) {
                ans += str.charAt(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(1);
        System.out.println(removeAllOccurancesOfChar(str, ch));
        sc.close();
    }
}
