package ArraysPractice;

import java.util.*;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 5};
        int arr2[] = {2, 2, 3, 5, 6};
        // output will be {2,3,5} since we are finding intersection of two sorted arrays
        System.out.println("Intersection of two sorted arrays is: ");
        List<Integer> list = printIntersectionOfTwoSortedArrays(arr1, arr2);
        list.forEach(System.out::print);
        System.out.println("Time Complexity: O(n + m) and Space Complexity: O(n) where n and m are sizes of two arrays..!!");
        // going to use optimal approach using two pointer technique
        System.out.println("Solving using Optimal Approach.Two Pointer Approach.!!");
//        List<Integer> optimalList = printIntersectionOfTwoSortedArraysOptimal(arr1, arr2);
//        optimalList.forEach(System.out::print);
//        System.out.println("Time Complexity: O(n + m) and Space Complexity: O(1) where n and m are sizes of two arrays..!!");
    }

//    private static List<Integer> printIntersectionOfTwoSortedArraysOptimal(int[] arr1, int[] arr2) {
//    }

    private static ArrayList<Integer> printIntersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        // using hashset to store elements of first array
        int n1 = arr1.length;
        int n2 = arr2.length;
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonElements = new LinkedHashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }
        return new ArrayList<>(commonElements);
    }
}
