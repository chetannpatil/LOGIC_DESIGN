package myString;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class FrequencyOfWordsInAParagraph {

	public static void displayAlphabatically(TreeSet<String> ts)
	{
		for(String s:ts)
		{
			//if(s.length())
			System.out.println("");
			System.out.print(s.substring(0, s.length()-1)+" ");
			System.out.print(s.charAt(s.length()-1));
		}
	}
	public static void displayDecreasingOrderOfFrequency(TreeSet<String> ts)
	{
		TreeSet<String> tsTemp = new TreeSet<String>(ts);
		char ca[]= new char [ts.size()];
		int index=0;
		for(String s:ts)
		{
			ca[index++]=s.charAt(s.length()-1);
		}
		Arrays.sort(ca);
		LinkedHashSet<String> wordsSet = new LinkedHashSet<String>();
		for(int x=ca.length-1;x>=0;x--)
		{
		//System.out.println("for ca[x]= "+ca[x]);
			
			for(String s:tsTemp)
			{
				if(s.charAt(s.length()-1)==ca[x])
				{
					wordsSet.add(s.substring(0,s.length()-1));
				}				
			}
		}
		int indxOfFrList=ca.length-1;	
		for(String st2:wordsSet)
		{
			System.out.println(st2+" "+ca[indxOfFrList--]);
		}		
		
	}
	
	public static TreeSet<String> findFrequencyOfWords(String s)
	{
		TreeSet<String> tsFrequency = new TreeSet<String>();
		StringBuilder sb = new StringBuilder(s.trim().toLowerCase());
		StringBuilder sbRes = new StringBuilder();
		for(int i=0;i<sb.length();i++)
		{
			char chValid = sb.charAt(i);
			if((chValid >=65 && chValid<=90)  || (chValid >=97 && chValid <=122))
			{
				sbRes.append(chValid);
			}
			else
			{
				if(sbRes.length() != 0)
				{
					if( sbRes.charAt(sbRes.length()-1) != 32 )
						sbRes.append(" ");
				}
				
			}
		}
		
		String sa[] = sbRes.toString().trim().split(" ");

		
		outer: for(int i=0;i<sa.length;i++)
		{
			int countAppearance=1;
			if(sa[i].equalsIgnoreCase("0"))
				continue outer;
			
				if(i==sa.length-1)
			{
				int countLast = 1;
				for(int f=0;f<sa.length-1;f++)
				{
					if(sa[f].equals(sa[sa.length-1]))
					{
						sa[f]="0";
						countLast++;
					}
						
				}
				tsFrequency.add(sa[sa.length-1]+countLast);
			}
		inner:	for(int k=i+1;k<sa.length;k++)
			{
				
				if(sa[i].equals(sa[k]))
				{
					countAppearance++;
					sa[k]="0";
				}
					if(k==sa.length-1)
					{
						tsFrequency.add(sa[i]+countAppearance);
					}
				
			}
		}
		System.out.println("ts lenth="+tsFrequency.size());
		return tsFrequency;
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("ENTER A PARAGRPH ");
			String inputStr = new Scanner(System.in).nextLine();
			
			System.out.println("enter dsiplay choice (0/1)");
			int choiceInt = new Scanner(System.in).nextInt();
			
			
			TreeSet<String> tsRes = findFrequencyOfWords(inputStr);
			
			System.out.println("result=______________________");
			if(choiceInt==0)
				displayAlphabatically(tsRes);
			else if(choiceInt==1)
				displayDecreasingOrderOfFrequency(tsRes);
			
				
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}

	}

}
