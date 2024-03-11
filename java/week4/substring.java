import java.util.Scanner;

public class substring {
    public static void subString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            // printing all substrings staring with char at index start
            for (int j = i; j < n; j++) {
                // System.out.println(str.substring(i, j + 1));
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
        /* for (int len = 1; len < n; len++) {
            // we have to print all strings with length as "len"
            for (int start = 0; start < n - len; start++) {
                int end = start + len - 1;
                System.out.println(str.substring(start, end + 1));
            }
        } */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        subString(n);
        sc.close();
    }
}
