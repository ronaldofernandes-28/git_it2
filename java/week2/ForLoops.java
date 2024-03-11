public class ForLoops {
    public static void main(String[] args) {
        int n = 5;
        /* int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        } */
        // int i = 1;
        // for(; i <= n; i++){ increment is not compulsory condition is also not compulsory 
        for(int i = 1; i <= n; i++){ // initialization happens 1 time codition n + 1 times step n times 
            System.out.println(i);
            // i++;
        }
        // System.out.println(i); outside scope of i
         for(int i = 1, j = 1; i <= n && j < 5; i++, j++){ // initialization happens 1 time codition n + 1 times step n times 
            System.out.println(i + " " + j);
            // i++;
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 4 ; j++){
                System.out.println(" i= " + i + " j= " + j);
            }
        }
    }
}
