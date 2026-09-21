package ArraysPractice;

public class ProductOfArrayItself {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // output will be [24, 12, 8, 6] because each element is the product of all the elements in the array except itself
        int[] result = productOfArrayItself(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] productOfArrayItself(int[] arr) {
        // how to find the product of array itself without using division operator
        // i will create two arrays one for left product and one for right product and then multiply them to get the final result
        // this will be the solution with O(n) time complexity and O(n) space complexity

        return new int[arr.length];
    }
}
