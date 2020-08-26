package batch81lab;

import java.util.Scanner;

/*7) WAM to accept an int ex:cba as input. 
If it contains 3 digits, the returned value should 
be a+ b*b + c*c*c where a is the units, 
b is the tens and c is the third digit.
Be careful of overflow here*/

public class Equation 
{

	static long equate(String num)
	{
		char ca[] = (num).toCharArray();
	//System.out.println("ca l ="+ca.length);
		//a+ b*b + c*c*c
		if(ca.length == 3)
		{
			int a = getMatchingInt(ca[2]);
			int  b= getMatchingInt(ca[1]);
			int  c = getMatchingInt(ca[0]);
			//System.out.println(a+" "+b+" "+c);
			long valueLong = (a + (b*b)+(c*c*c));
			return valueLong ;
		}
		
		return 0 ;
	}
	static int getMatchingInt(char ch)
	{
		int matchInt = 0;
		switch (ch) 
		{
		case 48:matchInt = 0;
			break;
		case 49:matchInt =1;
			break;
		case 50:matchInt =2;
			break;
		case 51:matchInt =3;
			break;
		case 52:matchInt =4;
			break;
		case 53:matchInt =5;
			break;
		case 54:matchInt =6;
			break;
		case 55:matchInt =7;
			break;
		case 56:matchInt =8;
			break;
		case 57:matchInt =9;
			break;

		default:matchInt =9;
			break;
		}
		return matchInt ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  integer of 3 digit ");
		String i = sc.next();
		//String iStr = i+"";
		long res = equate(i);
		System.out.println("res = "+res);

	}

}
