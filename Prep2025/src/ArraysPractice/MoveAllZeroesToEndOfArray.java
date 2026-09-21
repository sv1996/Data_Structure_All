package ArraysPractice;

public class MoveAllZeroesToEndOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4, 0, 5, 6};
        // output should be {1,2,3,4,5,6,0,0,0,0} since we have moved all zeroes to the end of the array
        moveAllZeroesToEndOfArrayByBruteForceAttack(arr);
        System.out.println("Array after moving all zeroes to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Time Complexity: O(n) and Space Complexity: O(n) because we are using extra space for temporary array..!!)");
    }



    public static void moveAllZeroesToEndOfArrayByBruteForceAttack(int[] arr) {
        int n = arr.length;
        // making a temporary variable to hold
        int[] temp = new int[n];
        // count of non-zero elements
        int index =0;
        for (int i = 0; i < n; i++) {

            if (arr[i]!= 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        // size of non elements
        int count = temp.length;
        for (int i = 0; i < count; i++) {
            arr[i] = temp[i];
        }
        // last step is to fill the remaining elements with zeroes
        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }
    }
}
