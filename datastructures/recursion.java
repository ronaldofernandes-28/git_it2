public class recursion {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallOutput = fact(n - 1);
        int output = n * smallOutput;
        return output;
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int smallSum = sum(n - 1);
        int output = n + smallSum;
        return output;
    }

    public static void print1ton(int n) {
        if (n == 0) {
            return;
        }
        // System.out.print(n);
        print1ton(n - 1);
        System.out.print(n);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fib_1 = fib(n - 1);
        int fib_2 = fib(n - 2);
        return fib_1 + fib_2;
    }

    public static boolean isSorted(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int[] smallArray = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }

    public static boolean isSortedBetter(int[] arr, int si) {
        if (si == arr.length) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        }
        return isSortedBetter(arr, si + 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
        print1ton(5);
        System.out.println();
        System.out.println(fact(5));
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(isSortedBetter(arr, 0));
    }
}
