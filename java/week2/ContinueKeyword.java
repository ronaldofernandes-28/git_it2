public class ContinueKeyword {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= n; i++) {
            if(i == 4){
                continue;
            }
            //i ++
            System.out.println(i);
        }
        int i = 1;
        while (i <= n) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
