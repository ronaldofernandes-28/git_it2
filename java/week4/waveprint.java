import java.util.Scanner;

public class waveprint {
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
    public static void printWave(int [][] mat){
        for(int j = 0; j < mat[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i< mat.length; i++){
                    System.out.print(mat[i][j] + " ");
                }
            }
            else{
                for(int i = mat.length - 1; i>= 0; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = takeinput(sc);
        print2darray(arr);
        printWave(arr);
    }
}
