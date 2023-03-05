import java.util.*;
import java.io.*;
public class Recursion_6 {
    static Boolean Exists(int a[],int n,int tgt ,int idx){
        if(idx >=n )return false ;
        if (a[idx] == tgt)return true;
        return Exists(a, n ,tgt ,idx+1);
    } 
    public static void main(String[] args) {
        int n,tgt;
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        System.out.println("Enter the array elements : ");
        int a[] =new int[n];
        for(int i =0;i <n;i++){
            a[i]=sc.nextInt();
        }
        tgt =sc.nextInt();
        if(Exists(a,n,tgt,0))
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}

