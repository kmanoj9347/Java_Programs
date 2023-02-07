import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to print Fibonacci series : ");
        int n =sc.nextInt();
        int a =1;//Initialy 2 elements are 1 and 1.
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a +" ");
            int sum =a+b;//calculating every 3rd elements in the series by summing up previous 2.
            a =b;
            b =sum;
           }
    }
}
