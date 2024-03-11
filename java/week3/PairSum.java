import java.util.Scanner;
public class PairSum {
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
    public static int Pairsum(int[] arr, int x){
        int numPairs= 0;
        for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j <arr.length; j++){
            if(arr[i] + arr[j] == x){
                numPairs++;
            }
        }
        }
        return numPairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = takeinput(n, sc);
        printarray(arr);
        System.out.println();
        System.out.println(Pairsum(arr, x));
    }
}
