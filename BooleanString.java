package batch81lab;

import java.util.Arrays;
import java.util.Scanner;
/*15) WAM to accept a string 
and return a boolean to indicate 
		whether the string passed 
		is a boolean or not.*/

public class BooleanString 
{

	static boolean isItBoolean(String str)
	{
		str = str.trim().toLowerCase();
		if(str.equalsIgnoreCase("true") == true )
			return true ;
		else if(str.equalsIgnoreCase("false") == true )
			return true ;
		else	
			return false ;
	}
	static int [] sortArray(int [] ia)
	{
		Arrays.sort(ia);
		
		return ia;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		//String resStr = numberOfOccurances(s1);
		//System.out.println("chars with their numbe of ocuurances :");
		boolean b = isItBoolean(s1);
		if(b== true)
		System.out.println("yes passed str is boolean");
		else
			System.out.println("no its not");

	}

}
