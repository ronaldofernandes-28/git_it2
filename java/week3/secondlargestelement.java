import java.util.Scanner;

public class secondlargestelement {
    public static int secondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length; i++){
            largest = Math.max(largest, arr[i]);
            if(arr[i] != largest){
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeinput(n, sc);
        printarray(arr);
        System.out.println();
        System.out.println(secondLargestElement(arr));
    }
}
