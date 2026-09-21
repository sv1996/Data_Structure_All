package Arrays;

public class SwapOfNumbers {
    public static void main(String[] args) {
     int arr[] ={1,2};
     int n = arr.length;
     swap(arr , 0 , n-1);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int arr[] , int a , int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
