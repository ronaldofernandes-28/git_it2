public class understandingstringstorage {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(str1);
        String str3 = "abc";
        String str4 = "abc";
        str1 = str1 + "def";
        System.out.println(str1);
        str1 = "xyz";
        str1.concat(str1); // returns a new string
        String str2 = new String("abc");
    }
}
