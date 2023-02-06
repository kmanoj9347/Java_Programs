import java.util.*;
 class HalfPyramidPattern{
    public static void main(String[] args) {
        //object creation
        Scanner sc =new Scanner(System.in);
        //enetering no of rows 
        System.out.print("Enter no of rows : ");
         int n =sc.nextInt();
         for(int i =0;i <n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}