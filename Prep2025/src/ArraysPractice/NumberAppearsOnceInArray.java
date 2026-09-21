package ArraysPractice;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsOnceInArray {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 3, 2, 4};
        // output will be 5 since it is the only number which appears once in the array
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println("The number which appears only once in the array is: " + uniqueNumber);
        System.out.println("Time complexity: O(n^2) and Space Complexity: O(1) since we are not using any extra space..!!");
        System.out.println();
        System.out.println("Solving using HashMap: ");
        int uniqueNumberHashMap = findUniqueNumberUsingHashMap(arr);
        System.out.println("The number which appears only once in the array is: " + uniqueNumberHashMap);
        System.out.println("Time complexity: O(n) and Space Complexity: O(n) because we are using extra space for HashMap..!!");
        System.out.println();
        System.out.println("Solving using XOR approach: ");
        int uniqueNumberXOR = findUniqueNumberUsingXOR(arr);
        System.out.println("The number which appears only once in the array is: " + uniqueNumberXOR);
        System.out.println("Time complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");
    }

    private static int findUniqueNumberUsingXOR(int[] arr) {
        int num= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            num = num ^ arr[i];
        }
        return num;
    }

    private static int findUniqueNumberUsingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1; // return -1 if no unique number found
    }

    private static int findUniqueNumber(int[] arr) {
        // Using two loops - Brute Force Approach
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }


        }
        return -1; // return -1 if no unique number found

    }
}
