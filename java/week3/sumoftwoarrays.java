import java.util.Scanner;

public class sumoftwoarrays {
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
    public static int[] SumOfTwoArrays(int[] arr1, int[] arr2, int[] output,int k){
        int carry =0;
        int i = arr1.length - 1, j = arr2.length -1;
        while(i >= 0 && j >= 0){
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        while(i >= 0){
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }
        while(j >= 0){
            int sum = arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }
        output[0] = carry;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = takeinput(n1, sc);
        printarray(arr1);
        System.out.println();
        int n2 = sc.nextInt();
        int[] arr2 = takeinput(n2, sc);
        printarray(arr2);
        int k = Math.max(arr1.length, arr2.length);
        int[] output = new int[k];
        output = SumOfTwoArrays(arr1, arr2, output, k - 1);
        System.out.println();
        printarray(output);
    }
}
