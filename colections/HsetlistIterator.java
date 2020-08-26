package colections;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;

public class HsetlistIterator {

	public static void main(String[] args) {
		
		
	/*	Object obj = new String();
		String s1 ;
		s1.length();
		//obj.length();
		 
		 */
		HashSet<String> hs = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
        
		for (int i = 1; i<=3 ;i++)
		{
			String s1 ;
			System.out.println("enter element "+i);
			
			s1 =sc.next();
			
			hs.add(s1);
		}
        sc.close();
		System.out.println("display");
/*		Enumeration<String> en = (Enumeration<String>) hs.iterator(); 
		
		System.out.println(en.hasMoreElements());*/
	//ListIterator<String> lit =  (ListIterator<String>) hs.spliterator();
	//lit.next();lit.next();
//	System.out.println(lit.hasNext());
	/*while (lit.hasNext())
	{
		String s1=lit.next();
		//System.out.println(lit.next());
		System.out.println(s1);
	}*/
	}

}
