package batch81lab;

import java.util.Arrays;
import java.util.Scanner;

/*
3) WAM to pass 2 arrays of ints to a method.
The method should return the max value
		present across both the array elements.*/
public class MaxOfTwoArryasInt
{

	static int maxOfTwoArrays(int [] iaF, int iaS [])
	{	
	    int ia [] = new int [iaF.length+iaS.length];
	 
	    int indexInt = 0;
	    for(int i=0;i<iaF.length;i++)
	    {
	    	ia[indexInt++] = iaF[i];
	    }
	    for(int i=0;i<iaS.length;i++)
	    {
	    	ia[indexInt++] = iaS[i];
	    }	
	    Arrays.sort(ia);
		
		
		return ia[ia.length-1] ;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ints of fisrt array [spaces inbetween]");
		String s1 = sc.nextLine();
		String [] sa =  s1.split(" ");
		int ia [] = new int[sa.length];
		for(int i=0;i<sa.length;i++)
		{ 
			ia[i] = Integer.parseInt(sa[i]);
		}
	
		System.out.println("enter ints of 2nd array [spaces inbetween]");
		String s2 = sc.nextLine();
		String [] sa2 =  s2.split(" ");
		int ia2 [] = new int[sa2.length];
		for(int i=0;i<sa2.length;i++)
		{ 
			ia2[i] = Integer.parseInt(sa2[i]);
		}
		
		System.out.println("max = "+maxOfTwoArrays(ia, ia2));

	}

}
