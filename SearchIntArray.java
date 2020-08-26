package batch81lab;

import java.util.Scanner;

public class SearchIntArray 
{

	static boolean isIntThere(int [] ia,int num)
	{
		for(int i=0;i<ia.length;i++)
		{
			if(ia[i] == num)
				return true ;
		}
		return false ;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ints spaces inbetween");
		String s1 = sc.nextLine();
		String [] sa =  s1.split(" ");
		int ia [] = new int[sa.length];
		for(int i=0;i<sa.length;i++)
		{
			ia[i] = Integer.parseInt(sa[i]);
		}
		System.out.println("enter number to search ");
		int num = sc.nextInt() ;
		boolean b = isIntThere(ia, num) ;
		if(b == true )
			System.out.println("yes found");
		else
			System.out.println(":no :(  not found ");

	}

}
