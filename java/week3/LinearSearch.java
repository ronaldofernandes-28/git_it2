import java.util.Scanner;
public class LinearSearch {
    public static int linearsearch(int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static int[] takeinput(int n, Scanner sc){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element at " + i + "th index.");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = takeinput(n,sc);
        int num = sc.nextInt();
        System.out.println(linearsearch(arr, num));
        sc.close();
    }
}
