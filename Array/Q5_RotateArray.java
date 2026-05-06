package Array;

public class Q5_RotateArray {
  public static void rotateArray(int[] arr, int k){
    int n = arr.length;
    k = k % n;  
    int [] newArr = new int[n];
    for(int i=0;i<k;i++){
      newArr[i] = arr[n-k+i];
    }

    for(int i=k;i<n;i++){
      newArr[i] = arr[i-k];
    }

    printArray(newArr);

  }


  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] +" ");
    }
  }
}
