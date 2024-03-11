import java.util.Scanner;

public class maxsum {
    public static long maxsumpath(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length, i = 0, j = 0;
        long result = 0, sum1 = 0, sum2 = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < m && j < n && arr1[i] == arr2[j]) {
                    result += arr1[i++];
                    j++;
                }
            }
        }
        while (i < m) {
            sum1 += arr1[i++];
        }
        while (j < n) {
            sum2 += arr2[j++];
        }
        result += Math.max(sum1, sum2);
        return result;
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
        int m = sc.nextInt();
        int[] arr1 = takeinput(m, sc);
        printarray(arr1);
        System.out.println();
        int n = sc.nextInt();
        int[] arr2 = takeinput(n, sc);
        printarray(arr2);
        System.out.println();
        System.out.println(maxsumpath(arr1, arr2));
        sc.close();
    }
}
