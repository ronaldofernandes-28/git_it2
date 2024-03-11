import java.util.Scanner;

public class leaders {
    public static void leader(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] >= max){
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
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
        leader(arr);
    }
}
