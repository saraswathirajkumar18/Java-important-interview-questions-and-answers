package mediumCode;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxMinInArray {
	//1.using if condition 
	//2.using arrays built-in sort()
	public static void findmaxmin(int[] num1)
	{  //we consider first element in the array as max and min value
		int max=num1[0];
		int min=num1[0];
		//compare the elements from the 1st index
		for(int j=1;j<num1.length;j++)
		{
			//compare max value with element in the array,if max<array element,i.e.array element is higher than max value
			if(max<num1[j])
			{
				//change max value into array element
				max=num1[j];
			}
			//compare min value with element in the array,if min>array element,i.e.array element is lesser than min value
			if(min>num1[j])
			{
			//change min value into array element
			min=num1[j];	
			}
			
		}
		//print maximum & minimum value
		System.out.println("maximum element in array"+max);
		System.out.println("maximum element in array"+min);	
		
		
	}
	public static void usingSortingMethod(int[]num1) {
		//use sort() in Arrays class-to sort element ascending order
		Arrays.sort(num1);
		//print maximum & minimum value
		//after sorting-last element is max value in array and first element is minimum value in the array
		System.out.println("maximum element in array"+num1[num1.length-1]);
		System.out.println("minimum element in array"+num1[0]);
			
	}
	public static void main(String[] args) {
		//notify user to enter number of array elements need
		System.out.println("enter numbers of element you want");
		//using Scanner class get input from user
		Scanner scanner=new Scanner(System.in);
		//store num of elements we want in variable n
		int n=scanner.nextInt();
		//create int array with size of user mentioned
		int[] num =new int[n];
		//use loop to retrieve value
		for(int i=0;i<n;i++)
		{   //notify user to enter the number
			System.out.println("enter number");
			//store value in num array variable
			num[i]=scanner.nextInt();
			
		}
		//stops getting input value from user 
		scanner.close();
		//print all array elements
		System.out.println(Arrays.toString(num));
		
		//call the methods to find max and min value in the array
		findmaxmin(num);
		usingSortingMethod(num);
		
		
		
		
	}

}
