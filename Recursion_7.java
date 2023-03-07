import java.util.*;
import java.io.*;
public class Recursion_7 {
    //Function to remove all occurance of
    //a character in the string .
    public static String removeChar(String str,char ch){
        //Base Case
        if(str.length() == 0){
            return " ";
        }
        //check the frist character of the given string .
        if(str.charAt(0) ==ch){
            //pass the rest of the string to recursion function call.
            return removeChar(str.substring(1),ch);
        }
        // Add the first character of str and string from recursion .
        return str.charAt(0) +removeChar(str.substring(1),ch);
    }  
    public static void main(String[] args) {
        System.out.println(removeChar("abccax",'a'));
    }
}
