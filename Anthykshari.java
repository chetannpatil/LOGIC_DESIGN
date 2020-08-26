package myString;

import java.util.Scanner;

public class Anthykshari {

	public static String joinEndToEnd(String s)
	{
		
		String sa[] = s.split(" ");
		int numOfComparisons=0;
		boolean didNotFindAnyMatch = false;
		StringBuilder sb = new StringBuilder(sa[0]);
		int index=0;
		String s1 = sa[0];
		char ch1 = s1.charAt(s1.length()-1);
		//while in
		while(numOfComparisons <= (sa.length-1)  &&  didNotFindAnyMatch == false)
		{			
			inner:	for(int k=0;k<sa.length;k++)
				{
					if(index==k)						
						continue inner;
					
					numOfComparisons++;
					if(sa[k].equalsIgnoreCase("0"))
						continue inner;
					
					String s2 = sa[k];
					char ch2=s2.toLowerCase().charAt(0);					
				
					if(ch1==ch2)
					{
						sb.append(s2);
						System.out.println(sb.toString());
							//System.out.println("sa[k] "+sa[k]+" ll be 0");	
						sa[k]="0";
						ch1 = s2.toLowerCase().charAt(s2.length()-1);	
						//System.out.println("sa[index] "+sa[index]+" ll be 0");	
						sa[index]="0";
						index=k;
						numOfComparisons=0;
					}
					else if (ch1 != ch2) {
						//System.out.println("ch1= "+ch1+" ch2 = "+ch2+" index = "+index+" && k= "+k+" && s1= "+s1+" && s2 = "+s2);
						if(numOfComparisons == sa.length-1)
						{
							System.out.println("numbfcomps = "+numOfComparisons+" & sa.lenfg-1 = "+(sa.length-1));
							didNotFindAnyMatch = true;
						}
							
					}
				
					
				}
			}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		
		try
		{
			System.out.println("ENTER FEW  WORDS");
			String inputStr = new Scanner(System.in).nextLine();
			System.out.println("-----------------------------------------------joined str is =");
			System.out.println(joinEndToEnd(inputStr));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
