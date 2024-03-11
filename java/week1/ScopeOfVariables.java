public class ScopeOfVariables {
    public static void main(String[] args) {
        int i = 1;
        // int j = 10; this will get incremented
        while(i <= 5){
            // j = 10 initialization
            int j = 10; // this j only lasts for i cycle afterwards a new j is created
            System.out.println(j);
            i++;
            j++;
        }
        System.out.println(i);
        // System.out.println(j); not allowed
        int a = 10;
        // int a = 100; not allowed
        // double a = 100; not allowed
        a = 100;
        // int b = 10; // you can use this b in if also and else also
        if(a >= 100){
            int b = 10;
            // int a = 10; not allowed
            System.out.println(b);
        }
        else{
            int b = 50;
            int c = 20;
            System.out.println(c);
            System.out.println(b);
        }
        // System.out.println(b); not allowed
        System.out.println(a);
    }
}