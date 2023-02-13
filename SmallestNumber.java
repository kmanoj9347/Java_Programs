import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
    System.out.println("Enter the three numbers:  ");
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    System.out.println(smallest(a,b,c));
   } 
   public static int smallest (int a,int b,int c){
    return Math.min(a,Math.min(b,c));
   }
}
