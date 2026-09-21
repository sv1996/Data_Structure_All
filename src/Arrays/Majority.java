package Arrays;

import java.util.Scanner;
/*
 Given an array A of N elements. Find the majority element in
  the array. A majority element in an array A of size N is an 
 element that appears more than N/2 times in the array.
 Output: 
For each test case the output will be the majority 
element of the array. Output "-1" if no majority element
 is there in the array.

Constraints:
1 <= T<= 100
1 <= N <= 107
0 <= Ai <= 106

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.
 */
public class Majority {
	private static void getMajority(int[] arr) {
		int n=arr.length;
     int maxcount=0;
     int index=-1;
     for(int i=0; i<n;i++)
     {
    	 int count=0;
    	 for(int j=0;j<n;j++)
    	 {
    		if(arr[i]==arr[j]){
    			count++;
    		}
    	if(count> maxcount){
    		maxcount=count;
    		index=i;
    	} 
    		 
    		 
    		 
    		 
    	 }// end of j loop
    	
    	 
     }// end of outer loop
     
     if(maxcount> n/2)
	 {
		 System.out.println("majority element is "+ arr[index]);
	 }
	 else
	 {
		 System.out.println("majority element is don't exist ");	 
	 }
     
  	}
	
	
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
       int size=s.nextInt();
       int arr[] = new int[size];
    for(int i=0; i<size;i++)
    {  
	arr[i]=s.nextInt();	
    }

       getMajority(arr);


	}

	

}
