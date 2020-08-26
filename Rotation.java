package batch81lab;

import java.util.Scanner;

public class Rotation 
{
	static boolean isRotation(String s1,String s2)
	{
		if (s1.length() != s2.length())
			return false ;
		String joinedStr = s1+s1;
		if(joinedStr.contains(s2) == true )
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
		boolean rotationBool = isRotation(s1.toLowerCase(), s2.toLowerCase());
		if(rotationBool == true)
		System.out.println("yes "+s1+" is rotation of "+s2);
		else
			System.out.println("No ");

	}

}
