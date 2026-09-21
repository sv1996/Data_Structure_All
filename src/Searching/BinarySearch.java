package  Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] =   {1,2,3,4,4,5};
        int data = -1;
     int  ans = binarySearch(arr,0,arr.length-1,data);
     if(ans==-1)
     {
         System.out.println("Item not present");
     }
     else
     {
         System.out.println("Item present at " +ans+" ith Index and data is "+arr[ans]);
     }
    }

    private static int binarySearch(int[] arr,int l, int r , int data) {
        int n = arr.length;
        if(r>=l)
        {
            int mid = l+(r-1) /2;
            if(arr[mid]==data)
                return mid;

            if(arr[mid]>data)
                return binarySearch(arr,l,mid-1,data);

            return binarySearch(arr,mid+1,r,data);
        }

      return -1;
    }
}
