package logicDesign;

import java.util.Scanner;

public class ReverseEachWordofSentence 
{

	public static String revers(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i =s.length()-1;i>=0 ;i--)
		{
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		
		System.out.println("ENTER UR SENTENSE");
		String strSent = new Scanner(System.in).nextLine();
		String sa[] = strSent.trim().split(" ");
		StringBuilder sb1 = new StringBuilder();
		
		for (int i =0;i<sa.length ;i++)
		{
			sb1.append( revers(sa[i]) +" " ) ;
			//sb1.append(sa[i]+" ");
		}
		
		System.out.println("RESULT SENTENCE : ");
		System.out.println(sb1.toString());
	}

}
