package batch81lab;

import java.util.Scanner;

public class DisplayAllPrimes {

	static void displayAllPrimes(int num)
	{
		System.out.println("the all prime numbers in the below "+num);
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i) == true )
				System.out.println(i);
		}
	}
	
	static boolean isPrime(int num)
	{
		if(num == 1 || num == 0)
			return false ;
		for(int i = 2 ;i< ((num/2)+1);i++ )
		{
			if((num % i) == 0 )
				return false ;
		}
		return true ;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range [int] ");
		int i1 = sc.nextInt();
		
		displayAllPrimes(i1);

	}

}
