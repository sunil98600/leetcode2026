package Array;
import java.util.Arrays;
public class Q1_LargestElement{
  public static int largest(int arr[]){
    Arrays.sort(arr);
    return arr[arr.length-1];
  }

  public static int betterLargest(int[] arr){
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
}