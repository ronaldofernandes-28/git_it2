public class Power {
    public static int power(int x, int n) {
        if (x == 0 && n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * (power(x, n - 1));
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
