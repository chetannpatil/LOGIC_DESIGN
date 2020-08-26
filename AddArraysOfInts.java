package batch81lab;

import java.util.Scanner;

public class AddArraysOfInts 
{

	static long sumOfArrays(int []ia)
	{
		long sum = 0;
		for(int i=0;i<ia.length;i++)
		{
			sum =sum+ ia[i];
		}
		return sum ;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ints of fisrt array [spaces inbetween]");
		String s1 = sc.nextLine();
		String [] sa =  s1.split(" ");
		int ia [] = new int[sa.length];
		for(int i=0;i<sa.length;i++)
		{ 
			ia[i] = Integer.parseInt(sa[i]);
		}
		
		System.out.println("susm = "+sumOfArrays(ia));

	}

}
