package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//arr[] ={10,10,10,30,30,40}
// output[]

// 10 ->3
// 30->2
// 40->1
///
//
public class FrequencyOfSortedArray {
    public static void main(String[] args) {
      int arr[] =new int[] {10, 20, 20, 10, 10, 20, 5, 20};
   //   int n =arr.length;
        System.out.println("Naive Approach");
        frequencyOfSortedArray(arr);
        System.out.println("Second Method");
        frequencyOfSortedArrayBetter(arr);
        System.out.println("Optimized Approach");
        frequencyOfSortedArrayOptimizedUsingHashmap(arr);

    }

    private static void frequencyOfSortedArrayOptimizedUsingHashmap(int[] arr) {
      int n = arr.length;
      Map <Integer,Integer>hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i] , hm.get(arr[i]) + 1);
            }
            else
            {
                hm.put(arr[i] , 1);
            }
        }
   for(Map.Entry<Integer, Integer> mp : hm.entrySet())
   {
    System.out.println(mp.getKey()  +" " + mp.getValue()) ;
   }

    }

    private static void frequencyOfSortedArrayBetter(int[] arr) {
        int n = arr.length;
        boolean visited[] = new boolean [n];
        Arrays.fill(visited, false);


        for (int i=0;i<n;i++) {
            if(visited[i] ==true)
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j] =true;
                    count++;
                }

            }
            System.out.println(arr[i] +"->"+ count);
        }

    }

    private static void frequencyOfSortedArray(int[] arr) {
         int n= arr.length;
         int freq=1;
         int i=1;
        while(i<n)
         {
             while(i<n && arr[i]==arr[i-1])
             {
                     freq++;
                     i++;
             }
             System.out.println(arr[i-1] + "->" +freq);
             i++;
             freq=1;

      if(i==n && arr[n-2] != arr[n-1])
     {
      System.out.println(arr[n-1]+"->"+1);
     }
         }
    }
}
