import java.util.*;
public class SwappingVaraibles {
    public static void main(String[] args) {
        int x ,y;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number :");
        x= sc.nextInt();
        System.out.print("Enter second number :");
        y= sc.nextInt();
        System.out.println("numbers before swapping x is : "+x+" and y is : "+y);
        x =x+y;
        y =x-y;
        x =x-y;
        System.out.println("numbers after swapping  x is : "+x+" and y is : "+y);
    }
}
