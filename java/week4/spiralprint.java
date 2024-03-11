import java.util.Scanner;

public class spiralprint {
    public static int[][] takeinput(Scanner sc) {
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i + "th row and " + j + "th column");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public static void print2darray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) {
            return;
        }
        int cols = mat[0].length;
        int i, rowstart = 0, colstart = 0;
        int numElements = rows * cols, count = 0;
        while (count < numElements) {
            // left to right
            for (i = colstart; count < numElements && i < cols; i++) {
                System.out.print(mat[rowstart][i] + " ");
                count++;
            }
            // top to down
            rowstart++;
            for (i = rowstart; count < numElements && i < rows; i++) {
                System.out.print(mat[i][cols - 1] + " ");
                count++;
            }
            //Right to left
            cols--;
            for (i = cols - 1; count < numElements && i >= colstart; i--) {
                System.out.print(mat[rows - 1][i] + " ");
                count++;
            }
            // bottom to up
            rows--;
            for (i = rows - 1; count < numElements && i >= rowstart; i--) {
                System.out.print(mat[i][colstart] + " ");
                count++;
            }
            colstart++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = takeinput(sc);
        print2darray(mat);
        printSpiral(mat);
        sc.close();
    }
}