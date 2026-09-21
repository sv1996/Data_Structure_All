package  Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int arr[])
    {
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>largest)
           {
               secondLargest =largest;
               largest=arr[i];
           }

           if(arr[i]<largest && arr[i]>secondLargest)
           {
               secondLargest=arr[i];
           }
       }
          return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 1,-1,-1,2};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
