package batch81lab;

import java.util.Scanner;

/*
18) WAM to accept a string as parameter. 
Find out how many digits, consonants, vowels 
are there in it and print it out.*/
public class CountOfVowelDigitsConsanants
{
	static void countVowelDigitsConsonats(String str)
	{
		str = str.trim().toLowerCase();
		int vCount = 0,digitsCount = 0, consCount = 0;
	outer:	for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch) == true )
				digitsCount ++ ;
			else if(ch >=  97 && ch <= 122)
			{
				switch (ch) 
				{
				case 'a':vCount ++ ;
					break;
				case 'e':vCount ++ ;
					break;
				case 'i':vCount ++ ;
					break;
				case 'o':vCount ++ ;
					break;
				case 'u':vCount ++ ;
					break;
					

				default:consCount ++ ;
					break;
				}
			}
			
		
		}
		System.out.println("vowel count    = "+vCount);
		System.out.println("conasnts count = "+consCount);
		System.out.println("digits         = "+digitsCount);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		countVowelDigitsConsonats(s1);

	}

}
