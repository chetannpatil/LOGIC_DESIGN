package batch81lab;

import java.util.Scanner;

/*1) WAP to test if a given number
is even (use % and & operator to
test)*/
public class EvenNum {

	static boolean isEvenUsingModulaceOperator(int num)
	{
		if( (num % 2) == 0 )
			return true ;
		else
			return false ;
	}
	
	static boolean isEvenUsingAndOperator(int num)
	{
		if( (num & 1) == 1)
		{
			return false ;
			
		}
		else
			return true ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  int ");
		int i1 = sc.nextInt();
		System.out.println("the entered numer "+i1+" is even ");
		System.out.println("using % says "+isEvenUsingModulaceOperator(i1));
		System.out.println("using & says "+isEvenUsingAndOperator(i1));

	}

}
