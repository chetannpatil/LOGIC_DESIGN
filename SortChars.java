package batch81lab;

import java.util.Arrays;

public class SortChars {

	public static void main(String[] args) 
	{
		
		
		if(args != null)
		{
			String s = args[0];
			char ca1 [] = s.toCharArray() ;
			
			Arrays.sort(ca1);
			
			int k=0;
			for(int i=0 ;i<ca1.length;i++)
				System.out.println(ca1[i]);	
			
				
		}

	}

}
