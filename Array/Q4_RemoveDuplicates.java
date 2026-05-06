package Array;
public class Q4_RemoveDuplicates{
  public static int removeDuplicates(int [] arr){
    int count = 1;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i] != arr[i+1]){
        count++;
      }
    }
    return count;
  }
}