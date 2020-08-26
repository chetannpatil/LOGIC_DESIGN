package c;

import java.util.Scanner;

/*
class UsdExc extends Exception
{
	
	
	//int sum;
	if ((a-b)<=-1)
		throw new Except
}*/
public class UserDefinedException extends Exception {
	
	public static int a,b,sum;
	
	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");a =sc.nextInt();
		System.out.println("enter b");b=sc.nextInt();
		if (a<b)
			try {
				throw new UserDefinedException();
			} catch (UserDefinedException e) {
				System.out.println("A  catn be smaller than B");
				e.printStackTrace();
			}
		else
		{
			sum = a- b;
			System.out.println("diff is "+sum);
		}
		
	}

}
