package mediumCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEleFromArray {
	//using another array variable
	public static void removeElement(int[] arr,int[] element)
	{   int size=arr.length-element.length;
		int[] res=new int[size];
		int l=0;
		for(int j=0;j<arr.length;j++)
		{System.out.println("j val"+j);
			for(int k=0;k<element.length;k++)
			{System.out.println(element.length);
				System.out.println("k val"+k);
				if(arr[j]!=element[k])
				{
				
				//System.out.println("bhjj");
				 res[l]=arr[j];
				 //System.out.println(res[l]);
				 l++;  
				break;
				}
				
				
			}
		}
		System.out.println(Arrays.toString(res));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,3,4,2};
		System.out.println("enter number of elements want to remove");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int[] ele=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("enter value from array value "+Arrays.toString(input));
			ele[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(ele));
		removeElement(input, ele);
	}

}
