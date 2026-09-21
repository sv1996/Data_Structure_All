package Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
         reverseArray(arr,0,n-1);
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]);
         }
    }

    private static void reverseArray(int[] arr, int startIndex, int endIndex) {
         while(startIndex<endIndex)
         {
             swap(arr ,startIndex, endIndex);
             startIndex++;
             endIndex--;
         }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
