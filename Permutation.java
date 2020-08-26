package batch81lab;

import java.util.Scanner;

/*6) Find out if one string is a permutation of the other
i/p : "staple" "plates" o/p: yes
i/p : "economics" "economios" o/p: no*/
public class Permutation 
{

	public static boolean isPermutation(String str1, String str2)
	{
		int costOfStr1 = 0,costOfStr2 = 0;
		for(int i=0 ;i<str1.length();i++)
		{
			costOfStr1= costOfStr1 + (int)str1.charAt(i);
		}
		for (int i=0 ;i<str2.length();i++)
		{
			costOfStr2 = costOfStr2 +(int)str2.charAt(i);
		}
		
		if(costOfStr1 == costOfStr2)
			return true ;
		else
			return false ;
		
	}
	public static void main(String[] args) 
	{
 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1 = sc.nextLine();
		System.out.println("enter 2nd string");
		String s2 = sc.nextLine();
		boolean permutationBool = isPermutation(s1.toLowerCase(), s2.toLowerCase());
		if(permutationBool == true)
		System.out.println("yes "+s1+" is permution of "+s2);
		else
			System.out.println("No ");
		
	}

}
