public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        // Modulus operation
        int c = a % b;
        System.out.println(c);
        // Integer division
        c = a / b; // if two numbers are int, the result will be int 1
        System.out.println(c);
        double d = 10 / 30; // if two numbers are int, the result will be int rhs is solved first result = 1.0
        System.out.println(d);
        // Double division with integer operands
        // Division with one double operand
        d = 10 / 30.0; // rhs is solved first result = 0.
        System.out.println(d);
        // Addition and division operation following BODMAS rule
        c = a + b / 5; // if two numbers are int, the result will be int rhs is solved first
        System.out.println(c); // bodmas rule is followed here / is solved first before + 
        // / has more precedence than + /, *, % has same precedence +, - has lower precedence
        // Multiplication and division operation following BODMAS rule
        c = a * b / 5; // if two numbers are int, the result will be int  left to right precedence due to theier left to right associativity
        // */ % have same precedence
        System.out.println(c); // bodmas rule is followed here / is solved first before + 
        // / has more precedence than + /, *, % has same precedence +, - has lower precedence
        // if multiple operators have same precedence then they are solved from left to right associativity
        // Division and multiplication operation with parentheses to change precedence
        c = b / (2 * a) ; // if two numbers are int, the result will be int
        System.out.println(c);
    }
}
