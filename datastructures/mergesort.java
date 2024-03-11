public class mergesort {
    public static void mergeSort(int[] arr, int l, int r) {
        // This means that there is at least one element
        if (l < r) {
            // Finding the mid point
            int m = (l + r) / 2;
            // Sorting the first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            // Merging the two sorted arrays
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // Stores the number of elements in the first half
        int num1 = m - l + 1;
        // Stores the number of elements in the second half
        int num2 = r - m;

        // Creating two temporary arrays of size 'numl' and 'num2' respectively.
        int[] L = new int[num1];
        int[] R = new int[num2];

        // Copy data to temporary arrays
        for (int i = 0; i < num1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < num2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Merge the temporary arrays back into arr[1 ... r]
        int i = 0; // Initial index of the first subarray
        int j = 0; // Initial index of the second subarray
        int k = l; // Initial index of the merged subarray
        while (i < num1 && j < num2) {
            // If the current element in array 'L'
            // is less than current element in array 'R'
            // assign the current element of 'arr' to current
            // element of 'L' and increase index 'k' and 'i' .
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } // assign the current element of 'arr' to current
              // element of 'R' and increase index 'k' and 'j'
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements of array 'L' to array
        // 'arr'
        while (i < num1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy the remaining elements of array 'R • to array
        // 'arr'
        while (j < num2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int input[]) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    public static void merged(int[] s1, int [] s2, int [] d){
        
    }
    public static void mergedSort(int[] arr){
        if(arr.length  <= 1){
            return;
        }
        int b[] = new int[arr.length / 2];
        int c[] = new int[arr.length - b.length];
        for(int i = 0; i < arr.length / 2; i++){
            b[i] = arr[i];
        }
        for(int i = arr.length / 2; i < arr.length; i++){
            c[i - arr.length/2] = arr[i];
        }
        mergedSort(b);
        mergedSort(c);
        merged(b, c, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 1, 5, 7, 2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
