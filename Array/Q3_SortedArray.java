package Array;

import java.util.Arrays;

public class Q3_SortedArray{
  public static boolean sortedArray(int [] arr){
    int count = 0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i] > arr[i+1]){
        count++;
      }
    }
    if(arr[arr.length-1] > arr[0]){
      count++;
    }
    
    return count <=1;
    }





    public static boolean isSortedArray(int[] arr){
      int n = arr.length;
      int [] sorted = arr.clone();
      Arrays.sort(sorted);
      boolean match = true;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(arr[(i+j)%n] != sorted[j]){
            match = false;
            break;
          }
        }
      }
      return match;
    }
  }

  //Updated vaersion of above method
  // public static boolean sortedArray(int [] arr){
  //   int count = 0;
  //   for(int i=0;i<arr.length;i++){
  //     if(arr[i] > arr[(i+1)% arr.length]){
  //       count++;
  //     }
  //   }
  //   return count <=1;
  //   }


