  package Array;
  public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,8,7,6};
        // largest number using sort function
        // int largestElement = Q1_LargestElement.largest(arr);
        // System.out.println(largestElement);
        // largest number without using sort function better approch;
        // int largestElement1 = Q1_LargestElement.betterLargest(arr);
        // System.out.println(largestElement);

        // int secondLargest = Q2_SecondLargestElement.secondLargest(arr);
        // System.out.println(secondLargest);

        boolean isSortedArray = Q3_SortedArray.sortedArray(arr);
        System.out.println(isSortedArray);
    }
  }
