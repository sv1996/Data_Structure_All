package  Sorting;

public class BubbleSort {
    void bubbleSort(int [] arr)
    {
       int n = arr.length;

    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i =0;i<n ;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        BubbleSort ob =  new BubbleSort();
        int arr[] =  {3,45,65,22,4,66};
        ob.bubbleSort(arr);
   System.out.print("Sorted Array");
   ob.printArray(arr);

    }
}
