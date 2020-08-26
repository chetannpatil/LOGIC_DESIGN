package others;

import java.util.Scanner;

public class Under_score_Class {
static int i;
	public Under_score_Class(int n) {
		System.out.println("++i ="+ ++i);
		if(n<78)
			System.out.println("less");
		else
			System.out.println("more");
		
	}
	
	{
		System.out.println("I>I");
		i=0;
		
		
	}
	public static void main(String  ...  s )
	{
		System.out.println("bC i="+i);
		
		new Under_score_Class(new Scanner(System.in).nextInt());
		
		System.out.println("Aftr new  i="+i);
	
			
	}

}
