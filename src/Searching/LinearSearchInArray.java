package Searching;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,-2,12,11};
        int x = 6;
        System.out.println(linearSearch(arr,x));
    }
     static int linearSearch(int [] arr, int x)
     {
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i] ==x)
            {
                return i;
            }
        }
        return -1;
     }
}
