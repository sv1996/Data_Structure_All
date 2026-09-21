package Arrays;

import java.util.Scanner;
import java.util.HashMap; 

public class MajorityUsingHashMap 
{
	private static void getMajority(int[] arr) {
	 HashMap<Integer , Integer> map= new HashMap<Integer , Integer>();
	 for(int i=0 ; i<arr.length ; i++)
	 {
	if(	map.containsKey(arr[i]) )
	{
		int count=map.get(arr[i])+1;
		if(count>arr.length /2){
			System.out.print("majority element is " + arr[i]);
			return ;
		}
		else
		{
			map.put(arr[i], count);
		}
	}
	else
	{
		map.put(arr[i], 1);
	} // if waale ka else;;
	
	 }
	 System.out.print("No majority element found");	 
 

		 
	 
		
} // private function
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

 
