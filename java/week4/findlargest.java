import java.util.Scanner;

public class findlargest {
    public static int [] [] takeinput(Scanner sc){
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter the element at " + i + "th row and " + j + "th column");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
    public static void print2darray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void FindLargest(int[][] mat){
        int maxsum = Integer.MIN_VALUE, idx = -1;
        boolean isRow = true;
        if(mat.length == 0){
            System.out.println("row " + idx + " " + maxsum);
            return;
        }
        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            if(sum > maxsum){
                maxsum = sum;
                idx = i;
            }
        }
        for(int i = 0; i < mat[0].length; i++){
            int sum = 0;
            int j;
            for(j = 0; j < mat.length; j++){
                sum += mat[j][i];
            }
            if(sum > maxsum){
                maxsum = sum;
                idx = j;
                isRow = false;
            }
        }
        if(isRow){
                System.out.println("\nRow");
            }
            else{
                System.out.println("\nColumn");
            }
            System.out.println(idx);
            System.out.println(maxsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = takeinput(sc);
        print2darray(input);
        System.out.println();
        FindLargest(input);
        sc.close();
    }
}
