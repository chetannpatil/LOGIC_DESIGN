package batch81lab;

import java.util.Scanner;

public class PrimeNumber {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  int");
		int i1 = sc.nextInt();
		
		boolean result = isPrime(i1);
		

		if (result == true)
			System.out.println("yes it is prime");
			else
				System.out.println(" no ....:(");

	}

}
