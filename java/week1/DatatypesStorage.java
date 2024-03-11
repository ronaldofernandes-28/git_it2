/**
 * This program demonstrates the usage of data types and their storage limits.
 */
public class DatatypesStorage {
    public static void main(String[] args) {
        // Integer data type
        int minInt = Integer.MIN_VALUE; // Minimum value for int -2 ^ 31
        int maxInt = Integer.MAX_VALUE; // Maximum value for int (2 ^ (31)) - 1
        System.out.println("Integer Min Value: " + minInt);
        System.out.println("Integer Max Value: " + maxInt);

        // Character data type
        char ch = 'a'; // Character 'a'
        int i = ch + 3; // Adding 3 to the ASCII value of 'a'
        System.out.println("Character 'a' + 3: " + i);
    }
}
