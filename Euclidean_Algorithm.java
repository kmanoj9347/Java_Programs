import java.util.*;
import java.io.*;
public class Euclidean_Algorithm {
    static int gcd(int a ,int b){
        if(a ==0 || b ==0)
        return 0;
        if (a == b)//base case
        return a ;
        if( a >b )
        return gcd(a-b ,b);
        return gcd(a,b-a);
    }
    public static void main(String[] args) {
        //int a=54, b=72;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        System.out.println("GCD(" + a +", " + b + ")= " +gcd(a,b));
    }
}
