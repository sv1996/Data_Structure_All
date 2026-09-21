package Arrays;

import java.util.Scanner;

public class MissingNumberUsingXOR {
public static int getDuplicate(int arr[],int  n)
{
	  
       int x1=arr[0];
       int x2=1;
    // for xor of all element in array;
       for( int i=1;i<n;i++)
       {
     x1=x1^arr[i]; 	 
       }
    
	    // for xor of all element from 1 to n+1
       for(int i=2; i<n+1;i++)
       {
      	x2=x2^i; 
       }
       return x1^x2;
}
	
	
	
	public static void main(String[] args) {
		 Scanner  s = new Scanner(System.in);
		  int test= s.nextInt();
		  int i;
		  for(int k=0; k<test;k++)
		  {
		      
		
		   int size = s.nextInt();
		   int arr[] = new int[size];
		          
	       for( i=0; i<size-1; i++){
	          arr[i] = s.nextInt();
	          }
	       int n=arr.length;
         int ans=getDuplicate(arr, n);
	       System.out.println("missing element is "+ ans);
	       
	}

}
}