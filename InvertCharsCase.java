package batch81lab;

import java.util.Scanner;

/*17) WAM to accept a string as parameter.
Convert the string characters to lowercase if its uppercase and 
to uppercase if its lowercase. 
If there are digits or special chars in the string, 
they should be omitted.*/

public class InvertCharsCase {

	static String invertCharsCase(String str)
	{
		str = str.trim();
		StringBuilder sb = new StringBuilder() ;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch) == true)
			{
				sb.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch) == true )
			{
				sb.append(Character.toUpperCase(ch));
			}
		}
		return sb.toString() ;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String resStr = invertCharsCase(s1);
		System.out.println("invrted chars strig = ");
		System.out.println(resStr);
	}

}
