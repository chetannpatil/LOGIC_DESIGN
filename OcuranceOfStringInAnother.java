package batch81lab;

import java.util.Scanner;

/*20) WAM to accept 2 strings as input. Find out how many 
times does the second param occur in the
first one (number of occurances) and return the count.*/

public class OcuranceOfStringInAnother 
{

	static int countOfStringOccuranc(String s1,String s2)
	{
		s1 =s1.trim().toLowerCase();
		s2 = s2.trim().toLowerCase();
		String [] sa = s1.split(" ");
		int count = 0;
		if(s1.contains(s2) == false )
			return 0;
		for(int i=0;i<sa.length;i++)
		{
			if(sa[i].equalsIgnoreCase(s2) == true)
				count ++ ;
		}
		return count ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1 = sc.nextLine();
		System.out.println("enter 2nd string");
		String s2 = sc.nextLine();
		int c = countOfStringOccuranc(s1, s2);
		System.out.println(s2+" appears "+c+" times in "+s1);

	}

}
