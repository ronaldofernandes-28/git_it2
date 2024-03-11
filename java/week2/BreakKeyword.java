public class BreakKeyword {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        for(i = 1; i<= n; i++){
            for(int j = 1; j<= n; j++){
                if(i== j){
                // if(i + 1 == j){
                    break; // exit the loop
                    // return exit the main 
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        while (i <= n) {
            if(i == 4){
                break;
                // System.out.println(i); unreachable code
            }
            System.out.println(i);
            i++;
        }
        for(int j =1; j <= n; j++)
        {
            if (j == 4){
                break;
            }
            System.out.println(j);
        }
        System.out.println("Outside While");
    }
}
