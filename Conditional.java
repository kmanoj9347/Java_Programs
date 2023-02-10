import java.util.*;
public class Conditional{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        //to print positive number entered by the user, if user enters a negative number, it is skipped.
        if(n>=0){
            System.out.println("You  entered postive number i.e : "+n);
        }else{
            System.out.println("you entered negative number ,so skipped");
        }
    }
}