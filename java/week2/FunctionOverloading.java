public class FunctionOverloading {
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static double sum(double a, double b){
        double sum = a + b;
        return sum;
    }
    public static int sum(int a){
        return a + 1;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(sum(a, b));
        System.out.println(sum(10.6, 1.8));
        System.out.println(sum(a));
    }
}
