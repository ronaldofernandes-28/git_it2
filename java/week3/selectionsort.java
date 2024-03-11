import java.util.Scanner;
public class selectionsort {
    public static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int minindex = i;
            for(int j = i; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
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
        SelectionSort(arr);
        System.out.println();
        printarray(arr);
    }
}
