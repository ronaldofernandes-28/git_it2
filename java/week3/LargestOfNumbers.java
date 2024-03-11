import java.util.Scanner;
public class LargestOfNumbers {
    public static int[] takeinput(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element at " + i + "th index.");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int[] arr = takeinput(n);
        System.out.println(arr);
        printArray(arr);
        int largest = largest(arr);
        System.out.println(largest);

        sc.close();
    }
}