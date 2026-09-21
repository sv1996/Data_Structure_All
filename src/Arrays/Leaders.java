package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			    
			   int n = Integer.parseInt(br.readLine().trim());
			    int arr[] = new int[n];
			   
			    String inputLine[] = br.readLine().trim().split(" ");
			    for(int i=0; i<n; i++){ 
			        arr[i] = Integer.parseInt(inputLine[i]);
			    }
			   
			  int maxelement=arr[n-1];
			  StringBuilder sb = new   StringBuilder();
		ArrayList<Integer> ar = new ArrayList<>();
		
			  
			  for(int i=n-1;i>=0;i--)
			  {
				 if(arr[i]>=maxelement)
				 {
					 maxelement=arr[i];
					 ar.add(maxelement);
					 
				 }
				  
		 }
		for(int i=ar.size()-1;i>=0;i--)
		{
			sb.append(ar.get(i)+" ");
		}
			    
		System.out.println(sb);	 
			
		}
		 
		 
	}	 
		 

	}

 
	            
	            
	            
	            
	            
	            
	   
	 
	            
	            
	            
	       

 
