import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a decimal number : ");
        int a =sc.nextInt();
        System.out.println("Enter the binary number : ");
        int b =sc.nextInt();
        int decimalnum=0;
        int power =1;
        while(b!=0){
            int rem =b%2;
            decimalnum +=rem*power;
            power *=2;
            b /=10;          
        }
        System.out.println(a+decimalnum);
    }
    
}
