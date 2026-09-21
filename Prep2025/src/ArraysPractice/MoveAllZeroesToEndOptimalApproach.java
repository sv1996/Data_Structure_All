package ArraysPractice;

public class MoveAllZeroesToEndOptimalApproach {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4, 0, 5, 6};
        // output should be {1,2,3,4,5,6,0,0,0,0} since we have moved all zeroes to the end of the array
        moveAllZeroesToEndOfArrayOptimalApproach(arr);
        System.out.println();
        System.out.println("Array after moving all zeroes to the end using optimal approach: ");
        System.out.println("Time Complexity: O(n) and Space Complexity: O(1) because we are not using any extra space..!!");
    }

    private static void moveAllZeroesToEndOfArrayOptimalApproach(int[] arr) {
        // using one Iteration we are solving this problem
        // case also will be only one element in array Or empty array
        int n = arr.length;
        if (n == 0 || n == 1) {
            // No need to process further
            return;
        }
        int nz = 0; // pointer to track non-zero elements
        int z = 0; // pointer to track zero elements
        while (nz < n)
        {
            if (arr[nz] != 0) {
                // swap of nz and z
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        // print the array after moving all zeroes to the end
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

