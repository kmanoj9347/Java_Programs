 //print all strings stored on odd indices of the array.
import java.util.Scanner;
public class Array_2 {
    public static void main(String[] args) {
        String[] arr ={"ab","bc","cd","de","ef","fg","gh"};
        for(int i=0;i <arr.length;i++){
        if(i % 2 !=0){
        System.out.println(arr[i]);
       }
    }   
  }
}
