public class countdigits {
    public static int countDigits(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(123456789));
    }
}
