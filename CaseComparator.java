package others;

import java.util.Comparator;

public class CaseComparator implements Comparator<String> {

	@Override
	public int compare(String s1 ,String s2) {
		
		//return s1.toLowerCase().compareTo(s2.toLowerCase());
		
		return s1.compareToIgnoreCase(s2);
	}

}
