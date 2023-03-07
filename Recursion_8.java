import java.io.*;
import java.util.*;
public class Recursion_8 {
    //Recursive function to reverse a string .
    public String reverse(String str){
        //check if the string is empty 
        if(str.isEmpty()){
            return str;
        }
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
public static void main(String[] args) {
    Recursion_8 obj1= new Recursion_8();
    String ans1 =obj1.reverse("manoj");
    System.out.println(ans1);
}    
}
