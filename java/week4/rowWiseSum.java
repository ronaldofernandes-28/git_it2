import java.util.Scanner;

public class rowWiseSum {
    public static void RowWiseSum(int[][] mat){
        int nRows = mat.length;
        if(nRows == 0){
            return;
        }
        int nCols = mat[0].length;
        for(int i = 0; i < nRows; i++){
            int rowsum = 0;
            for(int j = 0; j < nCols; j++){
                rowsum += mat[i][j];
            }
            System.out.print(rowsum + " ");
        }
    }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = takeinput(sc);
        print2darray(input);
        RowWiseSum(input);
        sc.close();
    }
}
