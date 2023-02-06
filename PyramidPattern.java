import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){ 
            System.out.print("* ");
        }
        System.out.println();
    }
}
}