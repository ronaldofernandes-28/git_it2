public class sumofarray {
    public static int sum(int[] arr, int startIndex) {
        if (startIndex == arr.length) {
            return 0;
        }
        return arr[startIndex] + sum(arr, startIndex + 1);
    }

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr1));
    }
}
