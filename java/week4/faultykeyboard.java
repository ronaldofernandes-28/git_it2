import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class faultykeyboard {
    static class Pair {
        char charater;
        int count;

        public Pair(char character, int count) {
            this.charater = character;
            this.count = count;
        }
    }

    public static List<Pair> makegroups(String s) {
        List<Pair> ret = new ArrayList<>();
        char currChar = s.charAt(0);
        int currCharCount = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == currChar) {
                ++currCharCount;
            } else {
                ret.add(new Pair(currChar, currCharCount));
                currChar = s.charAt(i);
                currCharCount = 1;
            }
        }
        ret.add(new Pair(currChar, currCharCount));
        return ret;
    }

    public static boolean canType(String s1, String s2) {
        List<Pair> group1 = makegroups(s1);
        List<Pair> group2 = makegroups(s2);
        if (group1.size() != group2.size()) {
            return false;
        }
        for (int i = 0; i < group1.size(); ++i) {
            if (group1.get(i).charater != group2.get(i).charater) {
                return false;
            } else if (group1.get(i).count > group2.get(i).count) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(canType(a, b) ? "true" : "false");
        }
        sc.close();
    }
}
