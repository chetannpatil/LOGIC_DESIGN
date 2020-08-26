package batch81lab;

import java.util.Scanner;

public class UniqueChars
{

	static String uniqueChars(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		outer :for(int i=1;i<str.length();i++)
		{
			for(int k=0;k<sb.length();k++)
			{
				if(str.charAt(i) == sb.charAt(k))
					continue outer ;
			}
		   sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String resStr = uniqueChars(s1.toLowerCase());
		System.out.println("string with uniq chars  :");
		System.out.println(resStr);

	}

}
