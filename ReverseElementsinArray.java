package mediumCode;

import java.util.Arrays;

public class ReverseElementsinArray {
	//1.print array element from last index
	//2.store the reversed value in new array
	//3.exchanging the elements using temp variable
	
	public static void reverseEle(int[] arr)
	{
		//store array value in new array variable 'a'
		int[] a=arr;
		//message about result
		System.out.println("reversed array is ");
		//print value from last index of array using for loop
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

	}
	public static int[] reverseElement(int[] arr)
	{
	//create new array variable
	int[] res=new int[arr.length];
	//create variable 'j' to maintain index(starting from 0) for new array variable 
	int j=0;
	//store arr[] value from last index to res[] variable
	for(int i=arr.length-1;i>=0;i--)
	{
	res[j]=arr[i];
    // To store arr[] value in next index,increment j value
   j++;
	}
	//return reversed value 
	return res;
	}
	public static int[] reverseElement1(int[] arr)
	{   //loop from 0 to (array length/2)-because we can cover all the array element during this range
		for(int i=0;i<arr.length/2;i++)
		{
		  //[2,9,1,4,5]
		  //we are exchanging position of 2 and 5 ,iteration continue for next elements in array
		   //create temp variable and store 0th index value in temp variable 
			int temp=arr[i];
			//store last index value in first index
			arr[i]=arr[arr.length-i-1];
			//store temp value in last index
			arr[arr.length-i-1]=temp;
			//next iteration starts from 1st index and element before the last index
		}
		//return reversed value 
		return arr;
	}
	
	
	public static void main(String[] args) {
		//create an int array
		int[] a= {2,9,1,4,5};
		//print array element using toString() in Array class
		System.out.println("array is "+Arrays.toString(a));
		//call the method
		reverseEle(a);
		//call the methods and print value returned by method
		System.out.println("reversed array is "+Arrays.toString(reverseElement(a)));
		System.out.println("reversed array is "+Arrays.toString(reverseElement1(a)));
		
	}
}
