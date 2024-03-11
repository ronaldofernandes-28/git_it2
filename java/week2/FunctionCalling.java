public class FunctionCalling {
    public static int sum(int i, int j){
                int sum = i + j;
        return sum;
    }
    public static void c(int n){
        System.out.println("Inside c " + n);
        n++;
    }
    public static void b(int n){
        c(n);
        System.out.println("Inside b " + n);
        n++;
    }
    public static void a(int n){
        b(n);
        System.out.println("Inside a " + n);
        n++;
    }
    public static int increment(int n){
        n++;
        System.out.println(n);
        return n;
    }
    public static void main(String[] args) {
        int a = 10, b = 15;
        int n = 10;
        int result = sum(a, b);
        System.out.println(result);
        a(n);
        System.out.println("Inside main " + n);
        n = increment(n);
        System.out.println(n);
    }
}
