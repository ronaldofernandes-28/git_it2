public class TypeConversions {
    public static void main(String[] args) {
        int d = (int) 10.6; // by default floating point literal is double
        short s = 17;
        float f = 1.7f; // by default floating point literal is double so we need to add f at the end of the literal to make it float type literal 
        //float f = (float) 1.7 // this is also valid but not recommended as it is not readable and we need to type cast it to float type explicitly
        int i = s; // implicit conversion from short to int
        s = (short) i; // explicit conversion from int to short
        char ch = 'a'; // char is 2 bytes
        int j = ch; // int is 4 bytes implicitly converting char to int
        ch = (char) i; // type casting explicitly converting int to char
        ch = (char) (ch + 1); // type casting explicitly converting int to char
        System.out.println(ch);
        System.out.println(i);
        System.out.println(j);
        System.out.println(4 + 4); // int + int = int
        System.out.println(4 + 4.5); // int + double = double answer will be of bigger type
        System.out.println(4.1 + 4.5); // double + double = double answer will be of bigger type
        System.out.println((double) 2/5); // double / int = double answer will be of bigger type
        System.out.println(2.0/5); // double / int = double answer will be of bigger type
    }
}
