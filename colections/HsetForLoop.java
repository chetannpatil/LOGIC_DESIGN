package colections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.AbstractCollection;


public class HsetForLoop {

	public static void main(String[] args) {
		
		
HashSet<String> hs = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=2 ;i++)
		{
			System.out.println("eneter element "+i);
			String s1 ;
			s1 =sc.next();
			hs.add(s1);
		}
		   sc.close();
hs.add("chetan");
hs.add("sandya");
String s2 = "mahima";
hs.add(s2);
		int sz= hs.size();
		System.out.println("U HaVE ENETRED total "+sz+" elelmetns");
		System.out.println();
		System.out.println("tHE ELELEMNTEs are ");

		  System.out.println();
		  for(String str :hs)
		  {
			  System.out.println(str);
		  }
		//System.out.println(hs);
	
        System.out.println();
		System.out.println("removig elleemtns ");
		
		String [] arayOfcoll = new String [hs.size()];
       int x =0;
       //hs.size();
		while(x<hs.size())
		{
			
			for(String str :hs)
			{
				arayOfcoll[x]=str;
				//System.out.println(arayOfcoll[x]);
				//System.out.println(hs.remove(arayOfcoll[x]));
				x++;
				
			}
		}
		
		
		
		for(int m=0;m<arayOfcoll.length;m++)
			{
			
			
			//System.out.println("colection now emptry "+hs.isEmpty());
			System.out.println("the element "+m+" is remvod is");
		
			System.out.println(hs.remove(arayOfcoll[m]));
				
		}

		System.out.println("aftr rmvng ELELEMNTEs , the collection contains  ");

		System.out.println();
		System.out.println(hs);
		
	}

}
