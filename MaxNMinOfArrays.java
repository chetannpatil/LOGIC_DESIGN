package batch81lab;

import java.util.Arrays;
import java.util.Scanner;

/*2) WAM to accept an array of ints as parameter. 
The method should return 
		the max value from it. Add another
		method which returns the min from the elements.*/
public class MaxNMinOfArrays
{

	static int maxOfArray(int []ia)
	{
		Arrays.sort(ia);
		return ia[ia.length-1];
	}
	static int minOfArray(int []ia)
	{
		Arrays.sort(ia);
		return ia[0];
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
		
		System.out.println("max = "+maxOfArray(ia));
		System.out.println("min = "+minOfArray(ia));

	}

}
