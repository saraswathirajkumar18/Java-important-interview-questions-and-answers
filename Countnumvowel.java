package mediumCode;
//count num of vowels in string
//method 1.using if condition
//method 2.using switch case
public class Countnumvowel {
	public void method1(String s1)
	{
		int count=0;
	
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
			
			System.out.println("num of vowels in string "+count);
		
	}
	public void method2(String s2)
	{
		int count1=0;
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			switch(c)
			{
				case 'a':
					     count1++;
					     break;
				case 'e':
					     count1++;
					     break;
				case 'i':
					     count1++;
					     break;
				case 'o':
					     count1++;
					     break;
				case 'u':
					     count1++;
					     break;
				default:
		            break;
			}
			
		}
		System.out.println("num of vowels in string "+count1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Countnumvowel count=new Countnumvowel();
		count.method1("java code");
		count.method2("java code");
		
	}

}
