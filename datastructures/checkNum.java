public class checkNum {
    public static boolean checkNum(int arr[], int x, int startIndex) {
        if (startIndex == arr.length) {
            return false;
        }
        if (arr[startIndex] == x) {
            return true;
        }
        return checkNum(arr, x, startIndex + 1);s
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 5 };
        System.out.println(checkNum(arr1, 2, 0));
    }
}
