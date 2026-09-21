package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {6, 8, 4, 8, 8};

        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {
        int n = arr.length;

        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
