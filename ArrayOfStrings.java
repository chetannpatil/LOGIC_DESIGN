package batch81lab;

import java.util.Scanner;

public class ArrayOfStrings {

	static String [] prescribedStrings(String [] sa,int ln)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ;i<sa.length;i++)
		{
			if(sa[i].length() < ln)
			{
				sb.append(sa[i]);
				if(i != (sa.length-1))
					sb.append(" ");
			}
		}
		String resSA [] = sb.toString().split(" ");
		return resSA ;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter few strings  [space in betweeen] ");
		String s1 = sc.nextLine();
		String testSA [] = s1.split(" ");
		System.out.println("enter lenth [integre]");
		int ln = sc.nextInt();
		String resSA [] = prescribedStrings(testSA, ln);
		
	System.out.println("the strings whose lenth is less than "+ln );
	for(String str:resSA)
		System.out.println(str);

	}

}
