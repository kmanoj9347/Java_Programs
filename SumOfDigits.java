import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any digits number: ");
        int x=sc.nextInt();
        int sum =0;
        while(x>0){
            sum +=x%10;// to calculate the sum of the digits .
            x/=10;
        }
        System.out.println("sum of all digits number is : "+sum);
    }
    
}
