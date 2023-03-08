import java.util.*;
import java.io.*;
public class Recursion_9 {
    //recursion function to reverse a string 
   public static String reverse(String str){
    //check if the string is empty 
    if(str.isEmpty()){
        return str;
    }
    else {
        return reverse (str.substring(1)+str.charAt(0));
    }
   } 
   public static void main(String[] args) {
    Recursion_8 obj1 =new Recursion_8();
    String str1 ="abcba";
    String ans1 =obj1.reverse(str1);
    if(str1.equals(ans1)){
        System.out.println("String is palindrome");
    }
    else{
        System.out.println("String is not palindrome");
    }
   }
}
