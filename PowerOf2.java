package batch81lab;

import java.util.Scanner;

/*7) WAP to test if a given
int number is a power of 2*/
public class PowerOf2 {

	static boolean isItPowerOf2(int num)
	{
		
		for(int i = 2 ;i<num ;i++)
		{
			if(  (  (int)Math.pow(2, i)) == num  )
			{
				return true ;
			}
			else
			{
				if(i > num )
					return false ;
			}
			
		}
		
		return false ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  int");
		int i1 = sc.nextInt();
		
		boolean result = isItPowerOf2(i1);
		
		
		if (result == true)
			System.out.println("yes it is power of 2");
			else
				System.out.println(" no ....:(");

	}

}
