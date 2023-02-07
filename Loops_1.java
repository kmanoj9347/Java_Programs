import java.util.*;
public class Loops_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter few numbers : ");
        int sum =0;
        while(sc.hasNextInt()){//check if input exits or not.
int num =sc.nextInt();
if(num>=0){//if input is positive or zero add it to the current sum.
    sum += num;
}
else{
    sum =-1;//input is negative so change sum to -1 and break out of the loop.
    break;
}
        }
        System.out.println(sum);
    }
    
}
