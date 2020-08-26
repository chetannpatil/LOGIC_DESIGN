package colections;

import java.util.Scanner;
import java.util.Stack;

public class Stck {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("enter element "+i);
			String addStr = sc.next();
			//stk.add(addStr);
			stk.push(addStr);
		}
		System.out.println("eneter element to seacrh ");
		String searchStr = sc.next();
		int srchIndex = stk.search(searchStr);
		if (srchIndex ==-1)
			System.err.println("elemnt not found");
		else			
		System.out.println(" the entered elemnt found in the "+srchIndex+" position");
		
		sc.close();
			System.out.println("displya");
       
	       for(String str :stk)
	       {
	    	   System.out.println();
			   System.out.println(str);
	       }
		System.out.println("REMOvaL");
		while(!stk.empty())
		{
		  //System.out.println(stk.peek());
		
			System.out.println(stk.pop());
			//System.out.println(stk.get(k));
			//stk.forEach();
		}
		System.out.println("display after removing");
		  for(String str :stk)
	       {
	    	   System.out.println();
			   System.out.println(str);
			   
	       }
		
	}

}
