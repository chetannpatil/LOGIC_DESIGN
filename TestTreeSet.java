package others;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		StringComparator sct = new StringComparator();
		Collection ts = new TreeSet(sct);
		
		
		Person p8 = new Person("zoro", 01);
		Person p9 = new Person("zoro", 1);
		Person p10 = new Person("amara", 1);
		
		Person p1 = new Person("chetan", 4);
		Person p2 = new Person("kavya", 05);
		
		Person p3 = new Person("chetan", 4);
		Person p4 = new Person("kavya", 5);
		
		Person p5 = new Person("chetan", 14);
		Person p6 = new Person("kavyashree", 005);
		Person p11 = new Person("bavya", 25);
		ts.add(p11);
		System.out.println("addinf p8 into col "+ts.add(p8));
		System.out.println("addinf p9 into col "+ts.add(p9));
		System.out.println("addinf p10 into col "+ts.add(p10));
		System.out.println("addinf p6 into col "+ts.add(p6));
		
		System.out.println("addinf p5 into col "+ts.add(p5));
		
		System.out.println("add p2 "+ts.add(p2));
		
		System.out.println("add p1 "+ts.add(p1));
		
		
		System.out.println("addinf p3 into col "+ts.add(p3));
		System.out.println("addinf p4 into col "+ts.add(p4));
		
		
		
		Person p7 = new Person("Chetan", 4);
		
		System.out.println("Casechnge addinng p7 into col "+ts.add(p7));
		
/*		System.out.println("p1 exist in col ?"+ts.contains(p1));
System.out.println("p2 exist in col ?"+ts.contains(p2));
System.out.println("p3 exist in col ?"+ts.contains(p3));
System.out.println("p4 exist in col ?"+ts.contains(p4));

System.out.println("p5 exist in col ?"+ts.contains(p5));
System.out.println("p6 exist in col ?"+ts.contains(p6));

System.out.println("p7 exist in col ?"+ts.contains(p7));*/

System.out.println("size is "+ts.size());
		//System.out.println(ts);
		
Iterator it = ts.iterator();
System.out.println("iterar");
while(it.hasNext())
{
	System.out.println(it.next());
	
    it.remove();
}

		System.out.println("for looping");
		for (Object o : ts)
		{
			Person p = (Person)o;
			System.out.println(p);
			//ts.add("sandya");
		
	//System.out.println("hascode of "+p+" is "+p.hashCode());
		}

		/*for (String s :args)
		{
			System.out.println(s);
		}*/
	}

}
