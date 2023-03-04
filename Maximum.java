//maximum element by using recursion.
import java.util.*;
import java.io.*;
public class Maximum {
    static int maxValue(int arr[],int n,int idx){
        if(idx == n-1)
        return arr[n -1];
        int maxOfLaterIndices =maxValue(arr, n,idx+1);
        int maxVal = Math.max(arr[idx],maxOfLaterIndices);
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr ={3,10,3,2,5};
        int n=arr.length;
        System.out.println(maxValue(arr,n,0));
        
    }
}
