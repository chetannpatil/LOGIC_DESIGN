package batch81lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*10) WAM to accept 2 int arrays as parameters.
The method should return one array with only 
unique elements across both the arrays.*/
public class UniquIntsAcroosTwoArrays 
{

	static int [] uniqOfTwoArrays(int [] iaF, int iaS [])
	{
		StringBuilder sb = new StringBuilder();	
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
	    
	/*    System.out.println("ia valye");
	    for(int g=0;g<ia.length;g++)
	    	System.out.println(ia[g]);*/
		int ia2 [] = new int[iaF.length+iaS.length];
		ia2[0] = iaF[0];
		int f=0 ;
		outer :for(int i=0;i<ia.length;i++)
		{	
			int i1 = ia[i];		
			inner:for(int k=0;k<ia2.length;k++)
			{				
				if(i==k)
					continue inner ;
				int i2 = ia2[k];
				if(i1 == i2)					
				{	
					continue outer ;
				}				
			}	
			ia2[f++]= i1;
			sb.append(i1+" ");				
							
		  		}
		
		String saR[] = sb.toString().split(" ");
		int resp [] = new int[saR.length];
		for(int k=0,m=0;k<saR.length;k++,m++)
		{
			resp[m]  = Integer.parseInt(saR[k]) ;
		}
		
		return resp ;
		
	}
	public static void main(String[] args) 
	{
		//Map<String, String> mp = new TreeMap<String, String>();
		//mp.put(null, //null);
		//System.out.println(mp.entrySet());
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
		int [] respIA = uniqOfTwoArrays(ia, ia2);
		System.out.println("the uniqe ints of bot aray are  ");
		for(int i= 0;i<respIA.length;i++)
			System.out.println(respIA[i]);

	}

}
