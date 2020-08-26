package others;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		CaseComparator scc = new CaseComparator();
		
		Map<String , String>  m1 = new TreeMap<String, String>(scc);
		Map<String , String>  m2 = new TreeMap<String, String> (scc);
		//System.out.println(m1.size());
		
	
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+m1.put("the first", "the second"));
		m1.put("the third", "the fourth");
		m1.put("The third", "the fourth");
		
		m2.put("the first", "the second");
		m2.put("the third", "the fourth");
		

		System.out.println(	"time 1= "+	System.currentTimeMillis());
		System.out.println(	"time 2= "+	System.currentTimeMillis());
	/*	System.out.println("m2 contents = "+m2);
		
		System.out.println("m1==m2 "+(m1==m2));
		System.out.println("m1 equls m2 = "+m1.equals(m2));*/
		
		Map<String , String>  mCons = new TreeMap<String, String>(m1);
		System.out.println("m1 contents    = "+m1);
		System.out.println("mCons contents = "+mCons );
		
		
		System.out.println("aftr chnging mcons");
		
		mCons.put("chetan", "iliyana");
		System.out.println("m1 contents    = "+m1);
		System.out.println("mCons contents = "+mCons );
		
		System.out.println("aftr chnging m1");
		m1.put("chetan ", "dhanshree");
		m1.put("fatima", "begam");
		System.out.println("m1 contents    = "+m1);
		System.out.println("mCons contents = "+mCons );
		
		System.out.println(m1.remove("fatima"));
		System.out.println("----");
		System.out.println(m1);
		
		
		System.out.println("-------------");
		//System.out.println("enrtsyet = "+m1.entrySet());
		Map<String, Integer>  m4 = new TreeMap<String, Integer>();
	m4.put("abcd",1);
	m4.put("xyz", 14);
		Set<Map.Entry<String, Integer>> em=m4.entrySet();
	
	
	System.out.println("    em=  ----"+em);
	
		for(Entry<String,Integer> mp2: em)
		{
			System.out.println("numrs = "+mp2.getValue());
			
		}
	}

}
