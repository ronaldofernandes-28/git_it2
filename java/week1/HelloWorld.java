// The HelloWorld class represents a simple Java program that prints "Hello World" to the console.
public class HelloWorld {
    // psvm to autocomplete
    // ctrl + / for single line comment for multiple lines select then ctrl + / and ctrl + / to uncomment 
    /* for block comments shift + alt + A */
    // The main method is the entry point for any Java application.
    public static void main(String[] args) {
        // println prints a new line at the end
        // sout tab to autocomplete
        // System.out.print is a function that prints the specified message to the console.
        // In this case, the message is "Hello World\n".
        System.out.print("Hello World\n");
        // System.out.print("\n") prints a newline character, moving the cursor to the next line.
        System.out.print("\n");
        // System.out.println is similar to System.out.print, but it automatically adds a newline character at the end of the string.
        // So, "Hello World" is printed and then the cursor moves to the next line.
        System.out.println("Hello World");
        // Finally, "Hello World" is printed again using System.out.print. Note that the cursor does not move to the next line this time.
        System.out.print("Hello World");
    }
}
