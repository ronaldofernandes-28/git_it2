import java.util.Scanner;

public class duplicates {
    public static String removeCOnsecutiveDuplicates(String str) {
        int n = str.length();
        if (n == 0) {
            return str;
        }
        String ans = "";
        int startIndex = 0;
        while (startIndex < n) {
            char uniqueChar = str.charAt(startIndex);
            int nextUniqueCharIndex = startIndex + 1;
            while (nextUniqueCharIndex < n && str.charAt(nextUniqueCharIndex) == uniqueChar) {
                nextUniqueCharIndex++;
            }
            ans += uniqueChar;
            startIndex = nextUniqueCharIndex;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeCOnsecutiveDuplicates(str));
        sc.close();
    }
}