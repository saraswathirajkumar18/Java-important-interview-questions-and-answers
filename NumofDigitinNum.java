package mediumCode;

public class NumofDigitinNum {
	//count number of digits in a given number
	//1.using loop and division operator
	//2.using recursion method and division operator
	//3.using string length()
	
	//to store number of digit,create variable "recursionCount"
	public static int recursionCount=0;
	public static void digitCount(int num)
	{
		// to store result create variable count
		int count=0;
		//use while loop whenever don't know number of iteration we want to perform
		//to confirm there is any digit available to count
		while(num!=0)
		{    
			//find number for next iteration
			//num=89213->first iteration,num=89213/10->8921.3->8921
			//second iteration,num=8921/10->892.1->892
			num=num/10;
			//increment count value
			count++;
		}
		//print the result
		System.out.println("number of digits :"+count);
	}
	public static void digitcountusingRecursion(int num)
	{
		//to confirm there is any digit available to count
		if(num!=0)
		{
			//increment the count value
			recursionCount++;
			//find number for next iteration
			num=num/10;
			//call the method to perform next iteration
			digitcountusingRecursion(num);
		}
		
	}
	public static void digitcountUsingStrlen(int num)
	{
		//convert number into string format
		String number=Integer.toString(num);
		//find length of the string
		int count=number.length();
		//print the results
		System.out.println("number of digits :"+count);
		
	}

	public static void main(String[] args) {
		//call the methods
		digitCount(89213);
		digitcountusingRecursion(123);
		//using recursion method,we didn't return count value.
		//after calling this method only,"recursionCount" value change from 0 to num of digits.
		//print num of digits
		System.out.println("number of digits :"+recursionCount);
		//call the method
		digitcountUsingStrlen(45623342);
	}

}
