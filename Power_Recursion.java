import java.util.Scanner;
public class Power_Recursion {
    public static int func(int a ,int b){ 
        if(b==0)//base condition.
        return 1;
        return(a*(func(a,b-1)));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=sc.nextInt();
        System.out.print("Enter the power number : ");
        int b=sc.nextInt();
        System.out.println("Required power is : "+func(a,b));
    }
}
