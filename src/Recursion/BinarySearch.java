package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,22,26,28};
        int target = 29;
        int ans = binarySearchRecursion(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int binarySearchRecursion(int []arr,int target,int startIndex,int endIndex)
    {
       if(startIndex>endIndex)
       {
           return -1;
       }
       int midElement= startIndex + (endIndex-startIndex) / 2;
       if(arr[midElement]==target)
       {
           return midElement;
       }
       if(arr[midElement]>target)
       {
        return  binarySearchRecursion(arr,target,startIndex,midElement-1);
       }
       return  binarySearchRecursion(arr,target,midElement+1,endIndex);
    }
}
