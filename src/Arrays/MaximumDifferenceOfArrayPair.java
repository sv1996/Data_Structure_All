package Arrays;
//arr[] = 2,3,10,6,4,8,1
//output = 8

public class MaximumDifferenceOfArrayPair {
    public static void main(String[] args) {
        int arr[] ={2,3,10,6,4,8,1};
        int n = arr.length;
        int ans1 =   maximumDifference(arr ,n );
        int ans2 =   maximumDifferenceOptimize(arr ,n );
        System.out.println("Normal Answer->" +ans1);
        System.out.println("Optimize Solution->" +ans2);
    }

    private static int maximumDifferenceOptimize(int[] arr, int n) {
       int min_value=arr[0];
       int ans = arr[1]-arr[0];
        for (int i = 1; i <n ; i++) {
            ans = Math.max(ans,arr[i]-min_value);
            min_value =Math.min(min_value, arr[i]);
        }
        return ans;
    }

    private static int maximumDifference(int[] arr, int n) {
        int max = arr[1] -arr[0];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
             max = Math.max(max, arr[j]-arr[i]);

            }
        }
        return max;
    }
}
