package myString;

import java.util.Scanner;

public class ReoveXtraSpae {

	public static String removeXtraSpace(String s)
	{
		StringBuilder sb  = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char chvalid = s.charAt(i);
			
			if(chvalid == 32)
			{
				if(sb.length() != 0)
				{
					if( sb.charAt(sb.length()-1) != 32)
					sb.append(chvalid);
				}
					
			}
			else
			{
				sb.append(chvalid);
			}
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println("ENTER WORDS FOR 1ST STRING ARRAY");
		String sa1InputStr = new Scanner(System.in).nextLine();
		System.out.println("u have enterd = "+sa1InputStr+" & length of ur i/p = "+sa1InputStr.length());
		String resStr = removeXtraSpace(sa1InputStr);
		System.out.println("res  ------------------------------------------------------------------------= ");
		System.out.println(resStr);
		System.out.println("lebgth of res = "+resStr.length());

	}

}
