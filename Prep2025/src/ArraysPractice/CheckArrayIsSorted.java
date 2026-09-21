package ArraysPractice;

import java.util.List;

public class CheckArrayIsSorted {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        boolean isSorted = checkIfArrayIsSorted(arr);
        List<Integer> list = List.of(1, 2, 3, 4, 5, -1);
        System.out.println("Check sorted Using Brute Force: " + isSorted);
        System.out.println("Check sorted Using Brute Force: " + checkIfListIsSorted(list));
    }

    private static Boolean checkIfListIsSorted(List<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkIfArrayIsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }



}
