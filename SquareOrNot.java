package batch81lab;

import java.util.Scanner;
/*
5) WAM to accept an int input. The method should 
return whether the num passed 
		is a square (like i/p-> 100,
				9, 16, etc -> o/p should be true) or not.*/

public class SquareOrNot 
{
static boolean isItASquare(int num)
{
	if(num == 1)
		return true ;
	for(int i = 0;i<((num/2)+1) ;i++)
	{
		if((i*i) == num )
			return true ;
	}
	return false ; 
		
}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  integer  ");
		int i = sc.nextInt() ;
		boolean b = isItASquare(i);
		if(b == true )
			System.out.println("yes "+i+" is square ");
		else
			System.out.println("no not a squre");

	}

}
