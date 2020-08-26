package others;

import java.util.Comparator;

public class StringComparator implements Comparator{
	
	
	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Person &&  o2 instanceof Person) 
		{
			  Person p1 = (Person)o1;
			     Person p2 = (Person)o2;
			     if (p1.name.length() == p2.name.length())
			    	 return ( (p1.name).compareToIgnoreCase(p2.name) );
			     // for phn numbers return (p1.numberOfPhones - p2.numberOfPhones ) ;
			     else
			    	 
			    	 return p1.name.length() - p2.name.length(); 
		}
		else
			throw new IllegalArgumentException("srry wrng inpt");
     
 
   
		
	}

}
