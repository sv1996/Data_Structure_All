package ArraysPractice;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
        // output will be [1,2,3,4,5,6]
        List<Integer> al = removeDuplicates(arr);
        al.forEach(System.out::print);
        System.out.println("Time Complexity: O(n)");
        System.out.println("removed duplicated better approach..!!");
      //     int size =  removeDuplicatesBetter(arr);
     //   System.out.println("Size of Arrays after removing duplicates: " + size);
        removeDuplicatesBetter(arr);
        System.out.println("Time Complexity: O(n) and space Complexity: O(1) because we are not using any extra space..!!");
        System.out.println("Printing Best Option");
        removeDuplicatesVeryBetterOneLoop(arr);
    }

    private static void removeDuplicatesVeryBetterOneLoop(int[] arr) {
        int j =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[j]) {
                arr[j] = arr[i-1];
                j++;
            }
        }
        System.out.println("After removing duplicated element ");
        for(int k=0;k<j;k++){
            System.out.println(arr[k] +" ");
        }
    }

    private static void removeDuplicatesBetter(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++)
       {
           if(arr[i] != arr[j])
           {
               arr[i+1] = arr[j];
               i++;
           }
       }
        System.out.println("Array after removing duplicates: ");
            for(int k=0;k<=i;k++)
            {
                System.out.print(arr[k] + " ");
            }

    }
    private static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Set<Integer> set = new HashSet<>();
        for (Integer num : list) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
