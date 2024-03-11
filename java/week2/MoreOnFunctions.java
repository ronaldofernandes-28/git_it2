public class MoreOnFunctions {
    public static double sum(int a, int b, double c){
        double ans = a + b + c;
        return ans; // return a + b
    }

    public static void printEvenNumbbers(int start, int end){// function can also have no inputs
        if(start % 2 == 0){
            start++;
        }
        for(int i = start; i <= end; i += 2){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int num1 = 10, num2 = 16;
        sum(num1, num2, 2.0);
        double ans = sum(num1, num2, 2.0);
        System.out.println(ans);
        printEvenNumbbers(3, 90);  
        // int a = printEvenNumbbers(); cant collect void function values
        // printEvenNumbbers(); no input is required error
    }
}
