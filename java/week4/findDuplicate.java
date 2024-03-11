import java.util.Scanner;

public class findDuplicate {
    public static int FindDuplicate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            sum += i;
        }
        int sumOfElement = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElement += arr[i];
        }
        return (sumOfElement - sum);
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
        System.out.println(FindDuplicate(arr1));
        sc.close();
    }
}
