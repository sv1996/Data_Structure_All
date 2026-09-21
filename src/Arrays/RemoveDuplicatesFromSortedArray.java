package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
         int arr[] = {10,10,20,20,30};
         List <Integer> newList =removeDuplicatesFromArray1(arr);
         newList.forEach((n)-> System.out.print(n+" "));
         System.out.println();
         System.out.println("Secoond Method output ");
         int newlength= removeDuplicatesFromArray2(arr);
         for (int i = 0; i < newlength; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int  removeDuplicatesFromArray2(int[] arr) {
        int n = arr.length;
        if(n==0 || n==1)
        {
            return n;
        }
        int[] temp = new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
             temp[j]=arr[i];
             j++;
            }

        }
        temp[j++] =arr[n-1];
        for(int i=0;i<j;i++)
        {
            arr[i]=temp[i];
        }
        return j;
    }

    public static List<Integer> removeDuplicatesFromArray1(int []arr) {
            int n = arr.length;
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<n-1;i++)
            {
                if(arr[i] != arr[i+1])
                {
                     al.add(arr[i]);
                }
            }
            al.add(arr[n-1]);
            return al;
      }
}
