import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        sc.close();

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        int allowance;
        if(grade == 'A'){
            allowance = 1700;
        }
        else if(grade == 'B'){
            allowance = 1500;
        }
        else{
            allowance = 1300;
        }
        double pf = 0.11 * basic;
        double totalSalary = hra + da + allowance - pf;
        int ans = (int) Math.round(totalSalary); // An internal function implemented in the Math class(no need to import as it is available as default) 
        // to round off the decimal values
        System.out.println(ans);
    }
}
