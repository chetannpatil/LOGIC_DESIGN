package batch81lab;

import java.util.Scanner;

/*12) WAM to accept an int array.
Return an array which contains only repeating elements.
Also identify how many times the numbers are repeating.*/

public class RepeatingInts
{

	static String [] repeatingInts(int [] ia)
	{
		StringBuilder sb = new StringBuilder();
		
		outer :for(int i=0;i<ia.length;i++)
		{
			if(ia[i] == 'z')
				continue outer ;
			int count = 0;
			int i1 = ia[i];
			boolean reapeatingBool = false ;
			inner:for(int k=0;k<ia.length;k++)
			{
				if(ia[k] == 'z')
					continue inner ;
				if(i==k)
					continue inner ;
				int i2 = ia[k];
				if(i1 == i2)					
				{
					count ++ ;	
					reapeatingBool = true ;
					//ia[i]='z';
					ia[k]='z';
				}
				
				
			}
			if(reapeatingBool == true )
			{
				sb.append(i1+"="+count);
				sb.append("\n");
			}
					
		    
		}
		return sb.toString().split(" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ints spaces inbetween");
		String s1 = sc.nextLine();
		String [] sa =  s1.split(" ");
		int ia [] = new int[sa.length];
		for(int i=0;i<sa.length;i++)
		{
			ia[i] = Integer.parseInt(sa[i]);
		}
		
		//int resIA [] = repeatingInts(ia);
		
		String []saRes = repeatingInts(ia);
		System.out.println("the repeating ints are  ");
		for(int i= 0;i<saRes.length;i++)
			System.out.println(saRes[i]);

	}

}
