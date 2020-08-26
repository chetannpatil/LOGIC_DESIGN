package c;

import java.util.Scanner;
//import java.io.PrintStream.err;;

class A 
{
	public void dom(int a, int b)
	{
		int res;
		try
		{
			res=a/b; 
		}
		catch(ArithmeticException ar)
		{
			throw ar;
		}
		System.out.println(res);
	}
}
public class RethrownExcptn {

	//has a
	A a2, a3;
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");a =sc.nextInt();
		System.out.println("enter b");b=sc.nextInt();
		A a1 = new A();
		try{
		a1.dom(a,b);
		
		}
		catch(ArithmeticException ar2)
		{
			System.out.println("re thrown exc");
			ar2.printStackTrace(); 
			
			}
		finally
		{
			System.err.println("err ");
			//err.pri
		}
	}

}
