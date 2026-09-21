package Recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {10,20,15,5,5};
        int n = arr.length;
        int sum= 15;
        int ans = subsetSum(arr, n ,sum);
        System.out.println(ans);
    }

    private static int subsetSum(int[] arr, int n, int sum) {
        if(n==0)
        {
            return (sum==0) ?1:0;

        }
        return subsetSum(arr, n-1,sum) + subsetSum(arr,n-1, sum-arr[n-1]);
    }
}
