import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any digit number: ");
        int x=sc.nextInt();
        int sum =0;
        while(x>0){
            sum +=x%10;
            x/=10;
        }
        System.out.println("sum of all digit number is : "+sum);
    }
    
}
