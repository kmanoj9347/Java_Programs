import java.util.*;
public class Factorial_recursion {
    public static int factorial(int n){
        if(n == 1)
        return 1;
        int fact =n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
