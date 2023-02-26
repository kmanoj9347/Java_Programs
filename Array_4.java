import java.util.Scanner;
public class Array_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n =sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int x =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(arr[j]-arr[i]==x){
                    System.out.println("Yes");
                }
            }
        }
        System.out.println("No");
    }
    
}
