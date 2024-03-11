public class Recursion{
    public static int fact(int n){
        if (n == 0 ){
            return 1;
        }
        // int smallOutput = fact(n -1);
        // int output = n * smallOutput;
        // return output;
        return n * fact(n-1);
    }
    public static int factorial(int n){
        int res = 1, i;
        for(i = 2; i<= n; i++)
            res *= i;
        return res;
    }
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(n)