package ArraysPractice;

public class MaximumConsecutiveOnce {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        // output should be 4
        int result = maximumConsecutiveOnes(arr);
        System.out.println("The maximum consecutive ones in the array is: " + result);
        System.out.println("Time Complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");
    }

    private static int maximumConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);

            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
