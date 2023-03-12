//sum of array elements using Recursion.
import java.util.*;
import java.io.*;
public class Recursion_5 {
  static int Sum(int arr[],int n){
    if(n <=0)
    return 0;
    return (Sum(arr, n-1)+ arr[n-1]);
  }  
  public static void main(String[] args) {
    int[] arr ={2,3,5,20,1};
    int n =arr.length;
    System.out.println(Sum(arr,n));
  }
}
