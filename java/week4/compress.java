import java.util.Scanner;
public class compress {
    public static String getCompressedString(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        // Variables to iterate the string and keep the count of the current character.
        int startIndex = 0;
        int endIndex = 0;
        // Resultant string.
        String compressedString = "";
        // Iterate all the characters of the string.
        while (startIndex < str.length()) {
            while ((endIndex < str.length()) && str.charAt(endIndex) == str.charAt(startIndex)) {
                endIndex += 1;
            }
            int totalcount = endIndex - startIndex;
            // If count is greater than 1, then append count to the string, else only
            // character.
            if (totalcount != 1) {
                compressedString += (str.charAt(startIndex) + "" + totalcount);
            } else {
                compressedString += str.charAt(startIndex);
            }
            startIndex = endIndex;
        }
        return compressedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getCompressedString(str));
        sc.close();
    }
}
