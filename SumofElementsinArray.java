package mediumCode;

public class SumofElementsinArray {
	//1.using loop to sum elements in array
	//2.sum elements using recursion method-calling the method repeatedly
	public static void sumusingLoop(int[] arr)
	{  //to store result,create variable-sum and initialize it
		int sum=0;
		//usig for loop get value from array variable-arr
		for(int i=0;i<arr.length;i++)
		{
			//add arr[] value with sum->sum=sum+arr[]
			//first iteration sum->0+2->2
			//second iteration sum->2+3->5 like that each iteration goes on
			sum+=arr[i];
		}
		//print the result
		System.out.println("sum is :"+sum);
		
	}
	//create the method with parameter-arr[],index of array
	//recursion method-instead of looping concept
	//-add element in each index by calling the methods repeatedly
	//how works:
	//1.receive value([2,3,5,1,4],5-1->4)-in array values are stored starting from 0th index so,decrease length by 1
	//2.check index==0,index-4=>so arr[4]+call the method([2,3,5,1,4],4-1)->4+call the method([2,3,5,1,4],3)
	//3.check index==0,index-3=>so arr[3]+call the method([2,3,5,1,4],3-1)->4+1+call the method([2,3,5,1,4],2)
	//4.check index==0,index-2=>so arr[2]+call the method([2,3,5,1,4],2-1)->4+1+5+call the method([2,3,5,1,4],1)
	//5.check index==0,index-1=>so arr[1]+call the method([2,3,5,1,4],1-1)->4+1+5+3+call the method([2,3,5,1,4],0)
	//6.check index==0,index-0=>4+1+5+3+2=>15
	public static int sumusingRecursionmethod(int[] arr,int index)
	{   
		if(index==0)
		{
			return arr[index];
		}
		else
		{
			return arr[index]+sumusingRecursionmethod(arr, index-1);
		}
		
	}

	public static void main(String[] args) {
		
        //create an array element
		int[] a=new int[]{2,3,5,1,4};
		//call the method
		sumusingLoop(a);
		//call the method and store value returned by method
		int result=sumusingRecursionmethod(a,a.length-1);
		//print result
	    System.out.println("sum is :"+result);
	}

}
