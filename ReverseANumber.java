package mediumCode;

public class ReverseANumber {
	public static int rev=0;
	//1.using loop 
	//2.using recursion calling method 
	
	public static void reverseNumber(int num) {
		//create variable-revNum to store result
		 int revNum=0;	    
		//to verify we reach last digit of num by checking num!=0,
		//if num value as single digit (num/10)->(1/10)->0.1 ,there is no next digit in num so,we return value otherwise continue loop to get remaining digit in the number 
		while(num!=0)
		{
		//use % operator used to get remainder value,using this concept we are getting digit from number 
	   //e.g:digit->12345%10->5(last digit)
		int digit=num%10;
		//add digit to result and to get result in number format multiply revNum by 10
		//revNum->0*10+5->5,next iteration revNum->5*10+4=>50+4->54
		revNum=revNum*10+digit;
		// using division operator we are getting num for next iteration
		//e.g:12345/10->1234.5,we store it as int->so num->1234
		num=num/10;
		}
		//print result
		System.out.println("reversed num is "+revNum);
		
	}
	/*public static void rev(int num) {
		
		if(num==0)
			return ;
		int digit=num%10;
		rev=(rev*10)+digit;
		num=num/10;
		rev(num);
		

	}*/
	//instead of loop,using recursion method also we achieve result.calling the method until num==0
	public static int reverseNumusingRecursion(int rev,int num)
	{   //each time we check num value equal to 0,then return result
		if(num==0)
		{
		return rev;	
		}
		//if num!=0
		else
		{   //getting digit from number 
			int digit=num%10;
			//add digit to result and to get result in number format multiply rev by 10
			rev=(rev*10)+digit;
			//getting num for next iteration
			num=num/10;
			//return result with reversed value and num for next iteration
			return reverseNumusingRecursion(rev,num);
			
		}
	}
	public static void main(String[] args) {
		 //call the method 
		reverseNumber(12345);
		//rev(12345);
		//System.out.println(rev);
		//call and print the method
		System.out.println("reversed num is "+reverseNumusingRecursion(0,12345));

	}

}
