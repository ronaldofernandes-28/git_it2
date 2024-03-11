import java.util.Scanner;
public class FahrenheittoCelsiusTable {
    public static void printFareheit(int start, int end, int step){
        int currentValue = start;
        while(currentValue <= end){
            int FahrenheitValue = (int) ((5.0 / 9) * (currentValue - 32));
            System.out.println(currentValue + "\t" + FahrenheitValue);
            currentValue += step;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        sc.close();
        printFareheit(start, end, step);
    }
}
