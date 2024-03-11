import java.util.Scanner;

public class stringsdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str5 = sc.next();
        System.out.println(str5 + " " + str5.length());
        String str6 = sc.nextLine();
        System.out.println(str6 + " " + str6.length());

        char[] arr = { 'c', 'o', 'd', 'i', 'n', 'g' };
        String str = "coding";
        String str1 = ""; // empty string
        String str2 = " "; // empty string
        String str3 = " is fun";
        String str4 = "coding";
        System.out.println(str.equals(str4));
        System.out.println(str.compareTo(str4)); // lexographical compare
        System.out.println(str.contains("ing"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5)); // 5 is exclusive write 6 to print 6th character t make sense if you
                                                 // put 7 error
        // System.out.println(str.substring(2)); empty string of size 0
        str = str + str3;
        str = str.concat(str3); // concat 1st string last
        // str += str3;
        System.out.println(str);
        System.out.println(str3);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        // System.out.println(str.charAt(-1)); invalid out of bound
        // System.out.println(str.charAt(6)); invalid out of bound
        System.out.println(str1.length());
        System.out.println(str2.length());
        sc.close();
    }
}
