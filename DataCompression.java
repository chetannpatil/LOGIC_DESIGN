package myString;

import java.util.Scanner;

public class DataCompression {

	public static String compressData(String s)
	{
		StringBuilder sb = new StringBuilder();
		int c=1;
	outer:	for(int i=0; i<s.length();i++ )
		{
			char mainChar =s.charAt(i);
			if(i==s.length()-1)
			{
				sb.append(mainChar);
				break outer;
			}
			sb.append(mainChar);
		
		inner:	for (int k=i+1;k<s.length();k++)
			{
			
				char cmpChar = s.charAt(k);
				if(mainChar==cmpChar)
					c++;
				if(k==s.length()-1)
				{
					sb.append(c);
				break outer;
				}
			
				else if (mainChar != cmpChar) 
				{
					sb.append(c);
					i=k-1;
					c=1;
					continue outer;
				}
					
			}
		}
		
		if (s.charAt(s.length()-2) != s.charAt(s.length()-1))
			sb.append(s.charAt(s.length()-1)+"1");
		
		if(sb.length()>=s.length())
			return s;
		else
		return sb.toString();
	}
	public static void main(String[] args) {
	
		System.out.println("ENTER A STRING");
		String word = new Scanner(System.in).next();
		
		
		
		System.out.println("comprsd data is = ");
		System.out.println(compressData(word));

	}

}
