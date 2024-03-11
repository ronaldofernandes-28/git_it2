public class BasicsOf2DArrays {
    public static void main(String[] args) {
        int [] [] array2d = new int [3][4];
        System.out.println(array2d[1][2]); // all array elements are initialized to 1
        array2d[2][1] = 12;
        System.out.println(array2d[2][1]);
    }
}
