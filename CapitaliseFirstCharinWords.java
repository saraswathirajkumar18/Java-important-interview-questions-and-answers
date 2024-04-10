package mediumCode;

public class CapitaliseFirstCharinWords {
	//1.Arrays and Character build in methods
	//2.String and its build in methods
	
	public static void captialiseMethod1(String word)
	{
		System.out.println("String: "+word);
		//convert string into array of char
		char[] c=word.toCharArray();
		//Change into uppercase-we check first char in array is not empty char
		if(c[0]!=' ')
		{
			//convert char in first index into uppercase letter
			c[0]=Character.toUpperCase(c[0]);
				
		}
		//use loop for remaining words in string
		for(int i=1;i<c.length;i++)
			
		{
	    //e.g java code -how will you identify next word's first letter-by checking space before the letter and char is letter or not 
		if((Character.isLetter(c[i]))&&(c[i-1]==' '))
		{
	    //change char into uppercase and store it in that char index
		c[i]=Character.toUpperCase(c[i]);
		}
			
		}
		//change char array into string using valueOf()
		String captialisedWord=String.valueOf(c);
		//print the result
		System.out.println("Captialised String: "+captialisedWord);

	}
	public static void captialiseMethod2(String word1)
	{
		//print string
		System.out.println("String: "+word1);
		//divide each word in string by using space 
		String[] eachWord=word1.split("\\s");
		//create string variable to store each captialised word 
		String captialisedWord ="";
		//enhanced for loop for retrive each word in string array
		for(String str:eachWord)
		{
			//get first char in string using substring()-result is in string format
			String firstLetter=str.substring(0,1);
			//change first letter into uppercase
			firstLetter=firstLetter.toUpperCase();
			//get remaining letters from string
			String remainingLetters=str.substring(1, str.length());
			//concate first and remaining letters and to add next word we use space
			captialisedWord+=firstLetter+remainingLetters+" ";
		}
		//print the result
		System.out.println("Captialised String: "+captialisedWord);
	}
	
	public static void main(String[] args) {
		//call the methods
		captialiseMethod1("java code");
		captialiseMethod1("java");
		captialiseMethod2("java code");
		captialiseMethod1("java");

}
}