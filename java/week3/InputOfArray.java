import java.util.Scanner;

public class InputOfArray{
    public static int[] takeinput(){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element at " + i + "th index");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
}
public static void printArray(int[] arr){
    for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
    }
} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element at " + i + "th index");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int[] arr1 = takeinput();
        printArray(arr1);
        sc.close();
    }
}