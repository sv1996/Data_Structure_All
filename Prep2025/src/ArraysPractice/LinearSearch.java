package ArraysPractice;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 70;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);

        }       }

    private static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == target)
            {
                return i; // return the index if found
            }
        }
        return -1; // return -1 if not found

    }
}
