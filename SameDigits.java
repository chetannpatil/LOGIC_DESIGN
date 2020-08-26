package batch81lab;

import java.util.Arrays;
import java.util.Scanner;

public class SameDigits 
{

	static boolean isSameDigitsInts(int i1,int i2)
	{
	
		String s1= i1+"";
		String s2 =i2+"";
		
		//return false if both's length are not equal
		if(s1.length() != s2.length())
			return false ;
		//compare both array elements by calling numberOfOccurances(String str)
		// cmparing returned values
		String result1 = numberOfOccurances(s1);
		String result2 = numberOfOccurances(s2);
	
		if(result1.trim().equalsIgnoreCase(result2.trim()) == true )
		{
			return true ;
		}			
		else
		{
			return false ;
		}
			
		
	}
	
	static String numberOfOccurances(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		char ca[] = str.toCharArray();
		for(int i = 0;i<ca.length ;i++)
		{
			char ch1 = ca[i];	
			int occuranceInt = 1;
			for(int k=i+1;k<ca.length;k++)
			{
				char ch2 = ca[k];
			
				if(ch1 == ch2)
				{
					occuranceInt ++ ;
					ca[k]='0';					
				}
			}
	
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st int");
		int i1 = sc.nextInt();
		
		System.out.println("enter 2nd  int");
		int i2 = sc.nextInt() ;
		
		//sort ints by making them arrray
		char ca1 [] = (i1+"").toCharArray() ;
		char [] ca2 = (i2+"").toCharArray() ;
		Arrays.sort(ca1);
		Arrays.sort(ca2);
		
		//convert back to int
		String s1 ="" , s2 ="" ;
		for(int i=0;i<ca1.length;i++)
		{
			s1=s1+ca1[i];
		}
		
		for(int i=0;i<ca2.length;i++)
		{
			s2=s2+ca2[i];
		}
		boolean result = isSameDigitsInts(Integer.parseInt(s1), Integer.parseInt(s2));
		if (result == true)
		System.out.println("yes both contacin same digits :)");
		else
			System.out.println(" no ....:(");

	}

}
