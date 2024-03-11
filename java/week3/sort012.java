import java.util.Scanner;

public class sort012 {
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
    public static void Sort012(int[] arr){
        int i = 0, nextZero = 0, nextTwo = arr.length - 1;
        while(i <= nextTwo){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                i++;
                nextZero++;
            }
            else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;
                nextTwo --;
            }
            else{
                i++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeinput(n, sc);
        printarray(arr);
        System.out.println();
        Sort012(arr);
        printarray(arr);
    }
}
