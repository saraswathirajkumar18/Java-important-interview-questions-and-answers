package mediumCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckStrSubstringofAnotherStr {
	//1.using contains method
	//2.using indexOf method
	//3.using regular expression
	
	public static void useofContains(String str,String substr)
	{
		//if string contains given substring then return true
		//print substring
		if(str.contains(substr))
		{
			System.out.println("string is substring");
		}
		//otherwise not substring
		else
		{
			System.out.println("string is not substring");		
		}
	}
public static void useofIndex(String str,String substr)
{
	//if substring in string then return index of substring otherwise return -1
	//if result!=-1,then print substring
	if(str.indexOf(substr)!=-1)
	{
	System.out.println("string is substring");	
	}
	//otherwise not substring
	else
	{
		System.out.println("string is not substring");
	}
}
public static void usingRegex(String str,String substr)
{   //mention substring in Pattern class compile()
	Pattern p=Pattern.compile(substr);
	//mention string
	Matcher m=p.matcher(str);
	//if match print substring otherwise not substring
	if(m.find())
	{   
		System.out.println("string is substring");
	}
	else
	{
		System.out.println("string is not substring");
	}
}
	public static void main(String[] args) {
		//call the methods
		useofContains("check word in string","check");
		useofContains("check word in string","java");
		useofIndex("check word in string","word");
		useofIndex("check word in string","wors");
		usingRegex("check word in string","string");
		usingRegex("check word in string","str");
		usingRegex("check word in string","str1");
	
		

	}

}
