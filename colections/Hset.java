package colections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hset {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=4 ;i++)
		{
			System.out.println("eneter element "+i);
			String s1 ;
			s1 =sc.next();
			hs.add(s1);
		}
		   sc.close();
		int sz= hs.size();
		System.out.println("U HaVE ENETRED total "+sz+" elelmetns");
		
		
		Iterator<String> it = hs.iterator();
		
		System.out.println("tHE ELELEMNTEs are ");
		System.out.println();
		int num = 1;
		while (it.hasNext()) {
			
			String s2 = (String) it.next();
			System.out.println(s2);
		
			num++;
			
		}
		
		
		
		System.out.println("removig elleemtns ");
		
		Iterator<String> newIt = hs.iterator();


		
		while(newIt.hasNext())
		{
			
	     newIt.next();
	     //System.out.println(newIt.remove());
	     newIt.remove();
		}
		
		
		System.out.println("grand new it");
		Iterator<String> gNewIt = hs.iterator();
		while(gNewIt.hasNext()) {

			System.out.println(gNewIt.next());
		}
		
		
		
	}

}
