package Arrays;


//i/p = {1,2,3,4,5,6};
//after rotation of 1 position counter Left Size
// counter clockWise Rotation
//o/p = {2 3 4 5 6 1};
public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        leftRotateByOnePlace(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    private static void leftRotateByOnePlace(int[] arr) {
        int n=arr.length;
        int temp=arr[0];
        for (int i = 1; i < n ; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1] =temp;
    }
}
