import java.util.*;
import java.io.*;
public class Recursion_3 {
    static int gcd(int a ,int b){
        if (b == 0)
        return a;
        return gcd(b, a%b);//Euclidean Algorithm by division.
    }
    public static void main(String[] args) {
        //int a =40, b =48;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the frst number : ");
        int x  =sc.nextInt();
        System.out.print("Enter the second number : ");
        int y =sc.nextInt();
        System.out.print("GCD(" + x +", " + y + ") = " + gcd(x,y));
    }
}
