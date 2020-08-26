package batch81lab;

import java.util.Scanner;

/*3) WAP to test if a given number
is divisible by 3. Do this for both
+ve and -ve ints*/
public class DivisibleBy3 {

	static boolean isDivisibleBy3(int num)
	{
		if(num == 0 )
			return false ;
		if( (num % 3) == 0 )
			return true ;
		else
			return false ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range [int] ");
		int i1 = sc.nextInt();
		
        boolean result = isDivisibleBy3(i1);
		

		if (result == true)
			System.out.println("yes it is divle by 3");
			else
				System.out.println(" no ....:(");

	}

}
