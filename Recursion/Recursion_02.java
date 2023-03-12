import java.util.*;
import java.io.*;
public class Recursion_2 {
    public static void func(int n ,int k,int i){
        if(k==0)
        return ;
        System.out.println((n*i)+" "); 
        func(n,k-1,i+1);// to print k multiple of the number.
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the k value : ");
        int k=sc.nextInt();
        func(n,k,1);
    }
}
