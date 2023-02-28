import java.util.*;
public class SumOfDigits_Recursion {
    public static int func(int n ){
        if(n ==0)
        return 0;
        return (n % 10 +func(n /10));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        int ans =func(n);
        System.out.println("Sum of digits in "+n + " is " +ans);
    }
}
