import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        sc.close();
        int currentFahrenhietValue = start;
        while (currentFahrenhietValue <= end) {
            int celciusValue = (int) ((5.0 / 9) * (currentFahrenhietValue - 32));
            System.out.println(currentFahrenhietValue + " " + celciusValue);
            currentFahrenhietValue += step;
        }
    }
}
