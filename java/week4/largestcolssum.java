import java.util.Scanner;

public class largestcolssum {
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
    public static int largestCol(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int largestCol = Integer.MIN_VALUE;
        for(int j = 0; j < col; j++){
            int sum = 0;
            for(int i = 0; i < row; i++){
                sum += arr[i][j];
            }
            if(sum > largestCol){
                largestCol = sum;
            }
        }
        return largestCol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = takeinput(sc);
        print2darray(input);
        largestCol(input);
        System.out.println();
        System.out.println(largestCol(input));
        sc.close();
    }
}
