import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        sc.close();
        while(i <= n){
            System.out.println("Hello World");
            i++;
        }
        i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}