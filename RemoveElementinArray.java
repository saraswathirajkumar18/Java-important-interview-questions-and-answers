package mediumCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementinArray {

	//using another array variable
	    
	    //method with parameter of array and element we want to remove
		public static void removeElement(int[] arr,int element)
		{   
			//create a new array variable to store result
			int[] res=new int[arr.length-1];
			//create variable-l to maintain index for result array
			int l=0;
			//use loop to get values in arr[]
			for(int j=0;j<arr.length;j++)
			{       //check arr[] value not match with element we want to delete
					if(arr[j]!=element)
					{
					//store unmatched arr[] value in res[]
					 res[l]=arr[j];
					 //increment l for increase index for result[]
					  l++;		
					}
			}
			//print the results
			System.out.println("after element removed from array "+Arrays.toString(res));
		}
	public static void main(String[] args) {
		// create int array
		int[] input= {1,3,4,2};
		//notify user to enter value
		System.out.println("enter value from array value "+Arrays.toString(input));
		Scanner scanner=new Scanner(System.in);
		//get value from user and store it in variable-ele
		int ele=scanner.nextInt();
		scanner.close();
		//call the method
		removeElement(input, ele);

	}

}
