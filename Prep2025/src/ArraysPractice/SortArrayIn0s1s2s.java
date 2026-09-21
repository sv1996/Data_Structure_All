package ArraysPractice;

public class SortArrayIn0s1s2s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0, 2, 1};
        sortArrayUsingBruteForce(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("Time and Space Complexity: O(n) and O(1)");
        System.out.println("Solving using Dutch National Flag Algorithm:");
        int[] arr2 = {0, 1, 2, 0, 1, 2, 1, 0, 2, 1};
        sortArrayUsingDNF(arr2);
        System.out.println("Sorted array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    private static void sortArrayUsingDNF(int[] arr) {
    }

    private static void sortArrayUsingBruteForce(int[] arr) {
        // using count approach
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }
        // filling the array based on counts
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }
        for (int i = countZero; i < countZero + countOne; i++) {
            arr[i] = 1;
        }

        for (int i = countZero + countOne; i < arr.length; i++) {
            arr[i] = 2;
        }

    }


}
