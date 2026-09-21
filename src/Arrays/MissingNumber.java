package Arrays;

import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		 
		 Scanner  s = new Scanner(System.in);
		  int test= s.nextInt();
		  int i;
		  for(int k=0; k<test;k++)
		  {
		      
		
		   int size = s.nextInt();
		   int arr[] = new int[size];
		          
	       for( i=0; i<size; i++){
	          arr[i] = s.nextInt();
	          }
	       int n=arr.length;
	      int total= ((n+1)*(n+2) )/2;
	        for(i=0 ; i<n; i++)
	        {
	            total=total-arr[i];
	        }
	  
	       System.out.println("missing number is "+total);
	       
	}

}
}