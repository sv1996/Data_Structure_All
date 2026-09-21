package Arrays;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		 
		 int test=s.nextInt();
		 
		 while(test-->0)
		 {
		  int size=s.nextInt();
		  int arr[] = new int[size];
		  
		  long pro=1;
		  for(int i=0;i<size;i++)
		  {
		      arr[i] =s.nextInt();
		      
		  }
		     for(int i=0;i<arr.length;i++)
		     {
		       pro=pro*arr[i];  
		         
		         
		         
		         
		     }
		     
		     System.out.println(pro);
		 }
		 

	}

}
