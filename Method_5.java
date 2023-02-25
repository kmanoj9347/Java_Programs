import java.util.Scanner;
public class Method_5 {
    static int sum(int a ,int b){
        return a+b;
    }
    public static void main(String[] args) {  
        int a ,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a =sc.nextInt();
        System.out.println("Enter the second number : ");
        b =sc.nextInt();
        System.out.println("Sum is : "+sum(a,b));
        
    }
}
