import java.util.Arrays;
import java.util.Scanner;

public class arrayintersaction {
    public static void ArrayIntersaction(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;
        int i = 0; // pointer to iterate over arrl
        int j = 0; // pointer to iterate over arr2
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
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
        int[] arr1 = takeinput(n, sc);
        printarray(arr1);
        int[] arr2 = takeinput(n, sc);
        printarray(arr2);
        System.out.println();
        ArrayIntersaction(arr1, arr2);
        sc.close();
    }
}
