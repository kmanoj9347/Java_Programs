import java.util.*;
public class Conditional_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks(<=100) : ");
        int n=sc.nextInt();
        if(n>=90){
            System.out.println("Your grade is A+");
        }
        else if(n>=80){
            System.out.println("Your grade is A");
        }
        else if(n>=70){
            System.out.println("Your grade is B+");
        }
        else if(n>=60){
            System.out.println("Your grade is B");
        }
        else if(n>=50){
            System.out.println("Your grade is C");
        }
        else if(n>=40){
            System.out.println("Your grade is D");
        }
        else if(n>=30){
            System.out.println("Your grade is E");
        }
        else if(n>1){
            System.out.println("Your grade is F");
        }
        else{
            System.out.println("Enter valid marks");
        }
    }
    
}
