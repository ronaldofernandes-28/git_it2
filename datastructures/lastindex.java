public class lastindex {
    public static int lastIndex(int[] arr, int x, int startIndex) {
        if (startIndex == arr.length) {
            return -1;
        }
        int smallAns = lastIndex(arr, x, startIndex + 1);
        if (smallAns != -1) {
            return smallAns;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        } else {
            return -1;
        }
    }

    public static int lastIndex(int[] arr, int x) {
        return lastIndex(arr, x, 0);
    }

    public static int lastIndex1(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }

        int[] smallArray = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        int k = lastIndex(smallArray, x);
        if (k != -1) {
            return k + 1;
        } else {
            if (arr[0] == x) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 3, 3 };
        System.out.println(lastIndex(arr, 3));
        System.out.println(lastIndex1(arr, 3));
    }
}
