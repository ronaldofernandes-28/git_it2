import java.util.Scanner;
import java.util.Arrays;

public class mergetwosortedarrays {
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
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] ans = new int[arr1.length + arr2.length];
        while(i < arr1.length && j  < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr1[i];
                i++;
                
            }
            else{
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
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
        System.out.println();
        int[] ans = mergeTwoSortedArrays(arr1, arr2);
        printarray(ans);
    }
}