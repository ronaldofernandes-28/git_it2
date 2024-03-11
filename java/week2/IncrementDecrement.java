public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 60, b = 80;
       
        // a = a + 1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        int c = a++;
        System.out.println(a);
        System.out.println(c);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);
        
        if(a++ > 60 && b++ > 80){
            System.out.println("Inside If");
        }
        else{
            System.out.println("Inside Else");
        }
        System.out.println("a " + a + " b "+ b);
    } 
}
