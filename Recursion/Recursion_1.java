import java.util.*;
import java.io.*;
public class Recursion_1 {
    static void func(int n){
        if(n >=1){
            func(n-1);
            System.out.println(n+" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        func(n);
        
    }
}
