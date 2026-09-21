package Arrays;

import java.util.Scanner;

/*
 Given an array of positive integers. Your task is to
  find that element whose value is equal to that of its index value.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, size of array. 
The second line of each test case contains array elements.

Output:
Print the element whose value is equal to index value. 
Print "Not Found" when index value does not match with value.
Note: There can be more than one element in the array w
hich have same value as their index. You need to print every such element's index separated by a single space. Follows 1-based indexing of the array.

Constraints:
1 ≤ T ≤ 30
1 ≤ N ≤ 50
1 ≤ A[i] ≤ 1000

Example:
Input:
2
5
15 2 45 12 7
1
1

Output:
2
1
 */
public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  int test=s.nextInt();
		   while(test-->0)
		  {
		      int size=s.nextInt();
		      int arr[] = new int[size+1];
		        for(int i=1;i<=size;i++)
		     {
		       arr[i]=s.nextInt();
		     }
		    boolean b=true;
		    int count=0;
		       for(int i=1;i<=size;i++)
		     {
		        if(arr[i]==i)
		        {
		           System.out.print(arr[i]+" ") ;
		          count++;
		      }
		          
		     }
		     if(count==0)
		     {
		        System.out.print("Not Found");   
		     }
		       
		     
		     
		     
		     
		     
		  System.out.println();   
		     
		     
		  
		  }
	}

}
