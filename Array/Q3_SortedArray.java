package Array;
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