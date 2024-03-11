public class BasicsOfArray {
    public static void main(String[] args) {
        int arr[] = new int[10]; // values are initialised to zero
        // int[] arr = new int[10]; this is also valid
        arr[0] = 5;
        arr[5] = 17;
        System.out.println(arr[0]);
        System.out.println(arr[5]);
        // arr[-1] = 18; not allowed
        // arr[10] = 15; not allowed
        // System.out.println(arr[3]); ans is zero
        char cArray[] = new char[10];
        double dArray[] = new double[10];
        System.out.println(cArray[0]);
        System.out.println(dArray[0]);
    }
}
