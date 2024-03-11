import java.util.Scanner;
public class ArrangeNumbers {
    public static int[] arrange(int[] arr,int n){
        int i = 0, j = n-1, num = 1;
        while(i < j){
            if(num % 2 == 1){
            arr[i] = num;
            num++;
            i++;
            }
            else{
            arr[j] = num;
            num++;
            j--;
            }
        }

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
        sc.close();
        int[] arr = new int[n];
        arr = arrange(arr, n);
        printArray(arr);
    }
}
