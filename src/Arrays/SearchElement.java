package Arrays;

import java.util.Scanner;

/*Given an integer array Arr[] and an element x. The task is to find if the given element is present in array or not.

Input:
First line contains an integer, the number of test cases 
'T'. For each test case, first line contains an integer 'N',
size of array. The second line contains the elements of the array 
separated by spaces. Third line contains element to be find in the array.

Output:
For each testcase, output a single line containing first index of 
element to be found in array. If element is not in the array, then
print "-1" (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Arr[i] <= 100

Example:
Input:
2
4
1 2 3 4
3
2 4 7 8
1

Output:
2
-1

Explanation:
Testcase 1: There is one test case with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is present at index 2, output is 2.
*/
public class SearchElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int test=s.nextInt();
		 while(test-->0)
		 {
		     int size=s.nextInt();
		     int arr[] = new int[size];
		       for(int i=0;i<size;i++)
		    {
		      arr[i]=s.nextInt();
		    }
		     int element=s.nextInt();
		     boolean b=true;
		       for(int i=0;i<arr.length;i++)
		    {
		      if(arr[i]==element)
		      {
		          System.out.print(i);
		          b=false;
		          break;
		      }
		        
		        
		    
		     }
		     if(b)
		     {
		         System.out.print("-1");
		     }
		   
		 
		   
		      System.out.println();
		 }  
		  

	}

}
