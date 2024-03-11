public class firstindex {
    public static int firstIndex(int[] arr, int x, int startIndex) {
        if (startIndex == arr.length) {
            return -1;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        }
        return firstIndex(arr, x, startIndex + 1);
    }

    public static int firstIndex(int[] arr, int x) {
        return firstIndex(arr, x, 0);
    }

    public static int firstIndex2(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr[0] == x) {
            return 0;
        }
        int[] smallArray = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        int fi = firstIndex(smallArray, x);
        if (fi == -1) {
            return -1;
        } else {
            return fi + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(firstIndex(arr, 3));
        System.out.println(firstIndex2(arr, 3));
    }
}
