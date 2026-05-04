package Array;
public class Q2_SecondLargestElement {
  public static int secondLargest(int[] arr){
    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){
      if(arr[i] > max){
        secondMax = max;
        max = arr[i];
      }else if(arr[i] > secondMax && arr[i] != max){
        secondMax = arr[i];
      }

    }
    return secondMax;
  }
}
