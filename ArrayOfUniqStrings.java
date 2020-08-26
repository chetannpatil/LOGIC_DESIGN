package batch81lab;

import java.util.Scanner;

public class ArrayOfUniqStrings 
{

	static String [] uniquStrings(String [] sa)
	{
		//
		String sa2 [] = new String [sa.length];
		sa2[0] = sa[0];
		//sb.append(sa[0]);
		//sb.append(" ");
		outer :for(int i=1,m=1 ;i<sa.length;i++,m++)
		{
			for(int k =0 ;k<sa2.length ;k++)
			{
				if(sa[i].equalsIgnoreCase(sa2[k]) == true )
					continue outer;
			}
			sa2[m] = sa[i];			
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<sa2.length;i++)
		{
			if(sa2[i] != null)
			{
				sb.append(sa2[i]);
				if(i != (sa2.length -1))
					sb.append(" ");
			}
				
		}
		return sb.toString().split(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter few strings  [space in betweeen] ");
		String s1 = sc.nextLine();
		String testSA [] = s1.split(" ");
		
		String resSA [] = uniquStrings(testSA);
		
	System.out.println("the unique strings  " );
	for(String str:resSA)
		System.out.println(str);

	}

}
