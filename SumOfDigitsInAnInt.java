package batch81lab;

import java.util.Scanner;

/*6) WAM to accept an int input.
Find the sum of the digits in the
number and return it.*/
public class SumOfDigitsInAnInt
{
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
	
	static long sumOfDigits(String num)
	{
		char ca[] = (num).toCharArray();
		int ia [] = new int[ca.length];
		for(int i=0;i<ca.length;i++)
		{
			int p = getMatchingInt(ca[i]);
			ia[i] = p ;
		}
		
		long sumLong = 0 ;
		for(int k=0;k<ia.length;k++)
			sumLong = sumLong + ia[k];
		
		return sumLong ;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  integer  ");
		String i = sc.next();
		//String iStr = i+"";
		long res = sumOfDigits(i);
		System.out.println("sum of digts in it = "+res);

	}

}
