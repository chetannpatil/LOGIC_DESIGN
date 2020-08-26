package batch81lab;

import java.util.Scanner;

public class NumberOfOccurancesOfEachChar 
{

	static String numberOfOccurances(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		char ca[] = str.toCharArray();
		for(int i = 0;i<ca.length ;i++)
		{
			char ch1 = ca[i];
			//System.out.println("ca[i] = "+ca[i]);
			int occuranceInt = 1;
			for(int k=i+1;k<ca.length;k++)
			{
				char ch2 = ca[k];
				//System.out.println("ca[k] = "+ca[k]);
				if(ch1 == ch2)
				{
					occuranceInt ++ ;
					ca[k]='0';					
				}
			}
			//System.out.println("sb char = "+ch1);
			if(ch1 != '0')
			{
				sb.append(ch1+""+occuranceInt);
				sb.append("\n");
			}
			
		}
		return sb.toString() ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String resStr = numberOfOccurances(s1);
		System.out.println("chars with their numbe of ocuurances :");
		
		for(int i=0;i<resStr.length();i++)
		{
			System.out.print(resStr.charAt(i));
			//System.out.println("");
		}	
		

	}

}
