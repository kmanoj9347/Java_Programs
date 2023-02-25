import java.util.Scanner;
public class Method_4 {
    public static void main(String[] args) {
        int a, b ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the frist number : ");
        a =sc.nextInt();
        System.out.println("Enter the second number : ");
        b=sc.nextInt();
        int  ans =add(a,b);
        System.out.println("The sum of two numbers a and b is : "+ans);
    }
    //method that calculate the sum 
    public static int add(int n1,int n2){
        int ans = n1 +n2;
        return ans;
    }
}
