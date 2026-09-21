package ArraysPractice;

import java.util.*;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        // I am going to solve using Set Data Structures
        int[] arr1 = {1, 2, 3, 4, 5,5};
        int[] arr2 = {2, 3, 5, 6, 7, 8};
        // output will be {1,2,3,4,5,6,7,8} since we are finding union of two sorted arrays
        List<Integer> list = findUnionOfTwoSortedArrays(arr1, arr2);
        list.forEach(System.out::print);
        System.out.println("Time Complexity: O(n + m) and Space Complexity: O(n + m) where n and m are sizes of two arrays..!!");
        System.out.println("Solving using Optimal Approach.Two Pointer Approach.!!");
        List<Integer> optimalList = findUnionOfTwoSortedArraysOptimal(arr1, arr2);
        optimalList.forEach(System.out::print);
        System.out.println("Time Complexity: O(n + m) and Space Complexity: O(n + m) where n and m are sizes of two arrays..!!");
    }

    private static List<Integer> findUnionOfTwoSortedArraysOptimal(int[] arr1, int[] arr2) {
        // using two pointer approach
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        Set<Integer> finalSet = new LinkedHashSet<>();
        // This is similar to merge in merge sort
        // This is also Using Two Pointer Approach correctly

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                finalSet.add(arr1[i]);
                i++;

            } else if (arr1[i] > arr2[j]) {
                finalSet.add(arr2[j]);
                j++;
            } else {
                finalSet.add(arr1[i]);
                i++;
                j++;
            }
        }
        // add remaining elements of arr1
        while(i<n1)
        {
            finalSet.add(arr1[i]);
            i++;
        }
       while(j<n2)
        {
            finalSet.add(arr2[j]);
            j++;
        }
        return new ArrayList<>(finalSet);
    }

    private static ArrayList<Integer> findUnionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        // using set data structures
        Set<Integer> finalSet = new LinkedHashSet<>();
        for (int num : arr1) {
            finalSet.add(num);
        }

        for (int num : arr2) {
            finalSet.add(num);
        }
        return new ArrayList<>(finalSet);
    }
}
