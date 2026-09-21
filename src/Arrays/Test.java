package Arrays;

public class Test {

	
public static void main(String[] args) {
		 
		int arr[] = {2, 3 , 1 , 5 ,  6};
		int n = arr.length;
		int k = 0;

		int ans =   BinarySearch( arr ,0 , n-1 ,k);

		if(ans==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at "+ ans + " index");
		}

	}

	private static int  BinarySearch(int [] arr , int l , int r  , int k) {
		
	 if(r>= l)
	 {
		 int mid = l + (r-1) /2;
		 if(arr[mid] ==k)
		 {
			 return mid;
		 }
		if(arr[mid]>k)
			 return BinarySearch(arr ,  l , mid-1  , k);
		     return BinarySearch(arr ,  mid+1 , r  , k);
		 
	 }
	return -1;
}
	

}

