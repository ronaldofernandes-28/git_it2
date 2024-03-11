import java.util.Scanner;
public class countword {
    public static int CountWord(String str){
        if(str.length() == 0){
            return 0;
        }
        int spaces = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                ++spaces;
            }
        }
        return spaces;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CountWord(str));
        sc.close();
    }
}
