import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year =sc.nextInt();
    System.out.println(is_LeapYear(year));
    }
    public static boolean is_LeapYear(int x){
        //year is leap if it is perfectly divisible by 4 ,then by 100 ,then 400,
        //if not  at any step, it is not leap year 
    boolean a =(x % 4 ==0);
    boolean b = (x % 100 !=0);
    boolean c = ((x %100 ==0)&&(x %400 ==0));
    return a && (b ||c );
   }
}
