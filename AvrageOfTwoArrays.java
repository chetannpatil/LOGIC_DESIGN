package batch81lab;

import java.util.Scanner;

/*4) WAM to pass 2 arrays of ints to a method. 
The method should return the average of 
		the values across the 2 arrays.
		The avg returned should be exact and not
		an approximation.*/
public class AvrageOfTwoArrays 
{

	static double avgOfTwoArrays(int [] iaF, int iaS [])
	{	
	    int ia [] = new int [iaF.length+iaS.length];
	 
	    double avgDouble = 0 ,sumDbl=0;
	    int indexInt = 0;
	    for(int i=0;i<iaF.length;i++)
	    {
	    	ia[indexInt++] = iaF[i];
	    }
	    for(int i=0;i<iaS.length;i++)
	    {
	    	ia[indexInt++] = iaS[i];
	    }
		
		for(int i=0;i<ia.length;i++)
		{	
			sumDbl = sumDbl + ia[i];
		}
		avgDouble = (sumDbl/(ia.length)) ;
		
		return avgDouble ;
		
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
		System.out.println("res = "+avgOfTwoArrays(ia, ia2));
	}

}
