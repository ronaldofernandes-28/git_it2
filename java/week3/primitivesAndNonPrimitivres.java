public class primitivesAndNonPrimitivres {
    public static void increment(int n){
        n++;
    }
    public static int[] incrementArray(int[] input){
        input = new int[7];
        System.out.println(input);
        for(int i = 0; i < input.length; i++){
            input[i]++;
        }
        return input;
    }
    public static void printarray(int[] arr){
        for(int i = 0; i < arr.length; i++){{
            System.out.print(arr[i] + " ");
        }}
    }
    public static void main(String[] args) {
        int i = 10;
        increment(i);
        System.out.println(i);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr);
        printarray(arr);
        arr = incrementArray(arr);
        printarray(arr);
    }
}
