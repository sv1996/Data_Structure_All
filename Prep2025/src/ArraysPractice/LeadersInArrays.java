package ArraysPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArrays {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        // output will be 17, 5 and 2 because they are greater than all the elements to their right
        printLeadersUsingTwoLoops(arr);
        System.out.println("Using right most element");
        printLeadersUsingRightMostElement(arr).forEach(System.out::println);
    }

    private static List<Integer> printLeadersUsingRightMostElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int rightMostElement = arr[arr.length - 1];
        list.add(rightMostElement);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= rightMostElement) {
                list.add(arr[i]);
                rightMostElement = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }

    private static void printLeadersUsingTwoLoops(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
