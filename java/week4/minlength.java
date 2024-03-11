import java.util.Scanner;
public class minlength {
    public static String minLength(String input){
        // Initialize variables to track the start and length of the shortest word
        int minStart = -1;
        int minlength = Integer.MAX_VALUE;

        // Initialize variables for tracking the start of the current word and loop index
        int currentstart = 0;
        int i;

        // Loop through each character in the input string
        for(i = 0; i <input.length(); i++){
            // Check if the current character is a space
            if(input.charAt(i) == ' '){
                // Calculate the length of the current word
                int currentwordlength = i - currentstart;

                // Update the start and length if the current word is shorter
                if(currentwordlength < minlength){
                    minStart = currentstart;
                    minlength = currentwordlength;
                }

                // Move the start index to the next character after the space
                currentstart = i + 1;
            }
        }
        if(minStart == -1){
            return input;
        }
        else{
            // Check the length of the last word after the loop
            int currentwordlength  = i - currentstart;
            if(currentwordlength < minlength){
                minStart = currentstart;
                minlength = currentwordlength;
            }
            // Return the result based on the identified shortest word
            return input.substring(minStart, minStart + minlength);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minLength(s));
        sc.close();
    }
}
