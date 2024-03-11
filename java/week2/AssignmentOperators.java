public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        // a = a + 1;
        a += 10;
        a ^= 1;
        a <<= 1;
        System.out.println(a);
        int i = 10;
         a = ++i * 5; // postfix has higher precedence
        System.out.println(a);
        a = i++ * 5; // postfix has higher precedence
        System.out.println(a);
        boolean x  = i++ > 5;
        System.out.println(x);
        x  = i + 5 > 5; // addition has more precedence than relational operator
        System.out.println(x);
        i = 6;
        int j = 8;
        x = i + 5 > 5 && j > 6; // first + then > then &&
        System.out.println(x);
        int c = 2 * 8 / 5; // same precedence left to right 
        System.out.println(c); 
        c = 2 * (8 / 5); // bracket has precedence
        System.out.println(c); 
    }
}
