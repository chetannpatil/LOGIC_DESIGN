package batch81lab;

import java.util.Scanner;

/*2) Accept 2 ints, print the multiplication tables of the smaller number
till the second number times (if 5,2 and given, print 2X1 till 2X5) =>
Print directly inside the method*/
public class MultTable 
{

	static void multTable(int i1,int i2)
	{
		int smallInt ,bigInt;
		if(i1 < i2)
		{
			smallInt = i1 ;
			bigInt = i2 ;
		}
		else
		{
			smallInt = i2 ;
			bigInt = i1 ;
		}
		
		for(int i = 1;i<=bigInt ;i++)
		{
			System.out.println(smallInt+" * "+i+" = "+(i*smallInt));
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st int ");
		int i1 = sc.nextInt();
		
		System.out.println("enter the 2nd int ");
		int i2= sc.nextInt();
		
		multTable(i1, i2);
		

	}

}
