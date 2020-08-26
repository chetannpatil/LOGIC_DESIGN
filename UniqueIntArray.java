package batch81lab;

import java.util.Scanner;

/*11) WAM to accept an int array.
Return an array which contains
only unique elements.*/
public class UniqueIntArray
{
	static String [] uniquInts(int [] ia)
	{
		StringBuilder sb = new StringBuilder();	
		//sb.append(ia[0]);
		//sb.append("\n");
		int ia2 [] = new int[ia.length];
		ia2[0] = ia[0];
		int f=0 ;
		outer :for(int i=0;i<ia.length;i++)
		{
			
		
			int i1 = ia[i];
		
			inner:for(int k=0;k<ia2.length;k++)
			{				
				if(i==k)
					continue inner ;
				int i2 = ia2[k];
				if(i1 == i2)					
				{	
					continue outer ;
				}
				
			}	
			ia2[f++]= i1;
			sb.append(i1);
			sb.append("\n");				
							
		  		}
		return sb.toString().split(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		String []saRes = uniquInts(ia);
		System.out.println("the uniqe ints are  ");
		for(int i= 0;i<saRes.length;i++)
			System.out.println(saRes[i]);

	}

}
