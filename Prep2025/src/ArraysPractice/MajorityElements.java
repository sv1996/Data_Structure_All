package ArraysPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        // using loops
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        // answer will be 2 since it appears more than n/2 times
        System.out.println("Solving using loops: " + majorityElementUsingLoops(arr));
        System.out.println("Majority element using sorting: " + majorityElementUsingSorting(arr));
        System.out.println("Majority element using HashMap: " + majorityElementUsingHashMap(arr));

    }

    private static String majorityElementUsingHashMap(int[] arr) {
        // solving using frequency Method
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        // now check for majority element
        int n = arr.length;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return "Majority element is: " + entry.getKey();
            }
        }
        return "Majority; element not found";

    }

    private static String majorityElementUsingSorting(int[] arr) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int potentialMajorityElement = arr[n / 2];

        for (int num : arr) {
            if (num == potentialMajorityElement) {
                count++;
            }
        }

        if (count > n / 2) {
            return "Majority element is: " + potentialMajorityElement;
        } else {
            return "Majority element not found";
        }


    }

    private static String majorityElementUsingLoops(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

                if (count > n / 2) {
                    return "Majority element is: " + arr[i];
                }

            }
        }
        return "Majority element not found";
    }
}
