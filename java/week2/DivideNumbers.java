public class DivideNumbers {
    public static int divideNumbers(int num,int deno){
        if(deno == 0){
            return Integer.MIN_VALUE;
        }
        // System.out.println("INside division function"); nothing is executed if return is encountered
        return num / deno;
    }

    public static void printDivisionResult(int num, int deno){
        if(deno == 0){
            // exit the function
            System.out.println("Division by zero not allowed");
            return;
        }
        System.out.println(num / deno);
        
    }

    public static void main(String[] args) {
        int num = 8;
        int deno = 0;
        printDivisionResult(num, deno);
        int result = divideNumbers(num, deno);
        System.out.println(result);
        if(result>0){

        }
        else{
            
        }

    }
}
