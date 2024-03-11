import java.util.Arrays;
import java.util.Scanner;

public class pairsum {
    public static int pairSum(int[] arr, int num) {
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = (arr.length - 1);
        int numPair = 0;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            } else {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementFromStartToEnd * (totalElementFromStartToEnd - 1) / 2);
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                while (tempStartIndex < tempEndIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }
                int totalElementFromStart = (tempStartIndex - startIndex);
                int totalElementFromEnd = (endIndex - tempEndIndex);
                numPair += (totalElementFromStart * totalElementFromEnd);
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }

    public static int[] takeinput(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "th index.");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = takeinput(n, sc);
        printarray(arr1);
        int num = sc.nextInt();
        System.out.println(pairSum(arr1, num));
        sc.close();
    }
}
