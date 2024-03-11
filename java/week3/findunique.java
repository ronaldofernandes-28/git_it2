import java.util.Scanner;

public class findunique {
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

    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                        break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        /*
        The function would never return from this line
        since the input array always contains a unique value.
        To avoid the ambiguity at the compile time,
        the function necessarily has to return a value in case
        the line number 22 doesn't return the desired value during
        the execution of the for loop.
        */
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeinput(n, sc);
        printarray(arr);
        System.out.println();
        System.out.print(findUnique(arr));

    }
}
