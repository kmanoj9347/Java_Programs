import java.util.*;
public class Fibonacci_Recursion {
  public static int fibo(int a){
    if(a <=1){
        return(a);
    }else {
        return(fibo(a-1)+(a-2));//nth fibonacci number.
    }
  }  
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a value : ");
    int n=sc.nextInt();
    System.out.println(fibo(n));
  }
}
