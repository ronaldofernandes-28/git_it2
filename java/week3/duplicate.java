import java.util.Scanner;
public class duplicate {
    public static int[] takeinput(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "th index.");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int Duplicate(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        /* The function would never return from this line
        since the input array always contains a duplicate value.
        To avoid the ambiguity at the compile time,
        the function necessarily has to return a value in case
        the line number 15 doesn't return the desired value during
        the execution of the for loop. */
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeinput(n, sc);
        printarray(arr);
        System.out.println();
        System.out.println(Duplicate(arr));
    }
}
