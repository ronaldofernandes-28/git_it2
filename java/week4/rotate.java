import java.util.Scanner;

public class rotate {
    public static void swapElements(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swapElements(arr, start, end);
            start += 1;
            end -= 1;
        }
    }

    public static void Rotate(int[] arr, int d) {
        if (arr.length == 0) {
            return;
        }
        if (d > arr.length && arr.length != 0) {
            d %= arr.length;
        }
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }

    public static int[] takeInput(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "th index.");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = takeInput(n, sc);
        printArray(arr1);
        int num = sc.nextInt();
        Rotate(arr1, num);
        System.out.println("Rotated array:");
        printArray(arr1);
        sc.close();
    }
}
