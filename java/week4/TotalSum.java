public class TotalSum {
    public static int getBoundarySum(int[][] mat){
        int sum = 0;
        for(int i = 1; i < (mat.length - 1); i++){
            sum += mat[0][i]; // upper side
            sum += mat[mat.length - 1][i]; // lower side
            sum += mat[i][0]; // left side
            sum += mat[i][mat.length - 1]; // right side
        }
        return sum;
    }
    public static int getLeftBoundary(int [][] mat){
        int i = 0, j = 0, diagonalSum = 0;
        while(i < mat.length && j < mat.length){
            diagonalSum += mat[i][j];
            i++;
            j++; 
        }
        return diagonalSum;
    }
    public static int getRightBoundary(int[][] mat){
        int i = 0;
        int j = mat.length - 1;
        int diagonalSum = 0;
        while(i < mat.length && j >=  0){
            diagonalSum = mat[i][j];
            i++;
            j--;
        }
        return diagonalSum;
    }
    public static void totalSum(int [][] mat){
        if(mat.length == 0){
            System.out.println(0);
            return;
        }
        int totalsum = getBoundarySum(mat) + getLeftBoundary(mat) + getRightBoundary(mat);
    if(mat.length % 2 != 0){
        totalsum -= mat[mat.length/ 2][mat.length/2];
    }
    System.out.println(totalsum);
    }
    public static void main(String[] args) {
        int [][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        totalSum(mat);
    }
}
