package mediumCode;

public class Pangram {
//pangram-String contains all the alphabets-[a-z]-here we ignore case sensitivity.
//create a method with string parameter
public static void checkPangram(String str)
{
//to avoid upper and lower case issue while comparsion-we convert string into any case(upper/lower) 
str=str.toLowerCase();
//create variable -result-store status of result 
boolean result=false;
//if string contains all the alphabets-length must be 26-so we check (str length<26),so set value as false
if(str.length()<26)
{
result=false;
}
//if str.length>=26
else
{

for(char ch='a';ch<='z';ch++)
{  //check alphabets [a to z] present in given string-if char present in string return index value otherwise return -1(-1<0) 
   //set value as false and if one of the letter in alphabet is not available in given string then checking remaining letters is unnecessary,so break the loop  
	if((str.indexOf(ch)<0))
	{
		result=false;
		break;
	}
	//if letter present in string then continue the loop and set value as true
	else
	{
		result=true;
	}
}
}
//if result is true-print the message as "pangram" otherwise print "not pangram"
if(result)
{
	System.out.println("str is pangram");
	
}
else
{
	System.out.println("str is not pangram");
}
		

}
	public static void main(String[] args) {
		//call the methods with different arguments
		checkPangram("abcd");
		checkPangram("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		checkPangram("The quick brown fox jumpsnover the lazy dog");
		


	}

}
