package ArraysPractice;

public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {
       int []  arr = {1,2,3,4,5};
        // output should be {2,3,4,5,1} since we have rotated left by one place
        leftRotateArrayByOnePlace(arr);
        System.out.println("Time Complexity: O(n) and Space Complexity: O(1) since we are not using any extra space..!!");

    }


    public static void leftRotateArrayByOnePlace(int[] arr) {
        int n = arr.length;
        // output should be {2,3,4,5,1} since we have rotated left by one place
       int temp  = arr[0];
       for(int i=1;i<n;i++)
       {
           arr[i-1] = arr[i];
       }
       // this will put the first element at the end of the array
       arr[n-1] = temp;
       System.out.println("Array after left rotation by one place: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
