import java.util.Scanner;

public class highestocuring {
    public static char highestOccuringChar(String str) {
        int n = str.length();
        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int maxFrequencyIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > freq[maxFrequencyIndex]) {
                maxFrequencyIndex = i;
            }
        }
        return (char) (maxFrequencyIndex + 'a');

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(highestOccuringChar(str));
        sc.close();
    }
}
