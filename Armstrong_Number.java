import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Armstrong_Number {
    static int level =-1;
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number n : "); 
       int n =sc.nextInt();
       int digits =0;
       int temp =n;
       while(temp >0){
        digits++;
        temp/=10;
       }
       if(n ==isArmstrong(n ,digits))
       System.out.println("Yes");
       else
       System.out.println("No");
    }
    public static int pow(int a ,int b){
        if(b == 0)return 1;
        if(b%2 == 0)return pow(a, b/2) * pow(a,b/2);
        return a * pow(a , b/2) * pow(a , b/2);
    }
    public static int isArmstrong(int n , int dig){
        if(n == 0)return 0;
        return pow(n%10, dig) + isArmstrong(n/10, dig);
    }
}
