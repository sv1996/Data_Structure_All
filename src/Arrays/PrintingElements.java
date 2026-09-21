package Arrays;

import java.util.*;
public class PrintingElements

{
	
	public static void print(int arr[])
	{
		
	   for(int i=0;i<arr.length;i++)
		{
			
			
			
			System.out.print(arr[i]+" ");
		}
 }
	
	public static int Sum(int arr[])
	{
		
		int sum=0;
		 for(int i=0;i<arr.length;i++)
			{
				
			sum=sum+arr[i];
				
				 
			}
			
		
		return sum;
		
	}
public static void main(String [] args)
	{
		
	Scanner s = new Scanner(System.in);
	int size= s.nextInt();
	
	int arr[] = new int [size];
	
	
	
	for(int i=0;i<size;i++)
	{
		arr[i] = s.nextInt();
     }
	
	print(arr);
	System.out.println();
int ans=	 Sum(arr);
System.out.println(ans);

}
	
	
	
}
