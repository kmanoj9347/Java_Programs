import java.util.Scanner;
public class Recursion_10 {
    // merge 2 strings .
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String a =sc.nextLine();
        System.out.println("Enter the second string : ");
        String b =sc.nextLine();
        System.out.print(merge(a,b));
    }
    public static String merge(String a, String b) {
        String ans =""; 
        if(a.length() == 0){
            ans +=b;
            return ans;
        }
        if(b.length() == 0){
            ans += a;
            return ans;
        }
        ans +=a.substring(0,1);
        ans +=b.substring(0, 1);
        ans +=merge(a.substring(1, a.length()),b.substring(1, b.length()));
        return ans;
    }
}
