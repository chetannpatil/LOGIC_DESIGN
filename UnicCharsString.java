package batch81lab;

import java.util.Scanner;

/*19) WAM to accept a string as input.
The method should return a string 
		which does not contain any
		repeating characters.*/
public class UnicCharsString {

	static String removeDuplicates(String str)
	{
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		//sb.append(str.charAt(0));
		outer :for(int i=0;i<str.length();i++)
		{
			char ch1 = str.charAt(i);
			ch1 = Character.toLowerCase(ch1);
			inner :for(int k=0;k<str.length();k++)
			{
				if(k == i)
					continue inner ;
				char ch2 = str.charAt(k);
				ch2 = Character.toLowerCase(ch2);
				if(ch1 == ch2)
					continue outer ;
			}
			
			sb.append(ch1);	
			//System.out.println("i = "+i);
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = sc.nextLine();
		String resStr = removeDuplicates(s1.toLowerCase());
		System.out.println("string with only non repeting chars  :");
		System.out.println(resStr);

	}

}
