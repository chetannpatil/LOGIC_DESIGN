package iQ;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class MatchingSubStringOfTwoArrays {

	public static String [] identifyMatchingSubString(String sa1[] , String []sa2)
	{
		String resSA[] = null;
		
		//StringBuilder sb = new StringBuilder();
		ArrayList<String> alMatchingStrs = new ArrayList<String>();
		TreeSet<String> tsMatchingStrs = new TreeSet<String>();
		for(int i=0;i<sa1.length;i++)
		{
			String s1=sa1[i];
			for(int k=0;k<sa2.length;k++)
			{
				String s2 = sa2[k];
				if(sa1[i].equalsIgnoreCase(sa2[k]))
					alMatchingStrs.add(s2);
					//tsMatchingStrs.add(sa1[i]);
				
				for(int z=0;z<s1.length()-2;z++)
				{
					if(s1.length()>2)
					{
						for(int outIndex=z+2;outIndex<s1.length();outIndex++ )
						{
							if( s2.contains(s1.substring(z, outIndex))   )
							{
								//System.out.println("s1 "+s1+" s2 = "+s2+" & z= "+z+" outindx = "+outIndex+" && k = "+k+" substring = "+s1.substring(z, outIndex));
								alMatchingStrs.add(s1.substring(z, outIndex));
							
							}
						}
					}				
									
				}
			
				//System.out.println("done s2------------------ "+s2);	
			}
			//System.out.println("done s1---------------------------------------------------------------------= "+s1);
		}
		resSA = new String[alMatchingStrs.size()];
		int f=0;
		for(String s:alMatchingStrs)
			resSA[f++]=s;
		return resSA;
	}
	
	public static void main(String[] args) {
		try
		{
			System.out.println("ENTER WORDS FOR 1ST STRING ARRAY");
			String sa1InputStr = new Scanner(System.in).nextLine();
			

			System.out.println("ENTER WORDS FOR 2ND STRING ARRAY");
			String sa2InputStr = new Scanner(System.in).nextLine();
			
			String sa1[] = sa1InputStr.split(" ");
			String sa2[] = sa2InputStr.split(" ");
			
			String resArray[] = identifyMatchingSubString(sa1, sa2);
			
			System.out.println("matcing strings are..................");
			int numbInt=1;
			for(String s:resArray)
				System.out.println((numbInt++)+" "+s);
			
			
		}
		catch(Exception e)
		{
		System.out.println(e.getLocalizedMessage());	
		e.printStackTrace();
		}

	}

}
