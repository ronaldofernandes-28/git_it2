public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = a & b;
        System.out.println(c);
        c = a | b;
        System.out.println(c);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1); // a * 10 ^ 2
        System.out.println(a << 3); // a * 10 ^ 8
        System.out.println(a >> 1); // 10 / 2
        System.out.println(a >> 2); // 10 / (2 ^ 2)
    }
}
