package others;

import java.io.Serializable;

public class Person implements Comparable ,Serializable{
	

	@Override
	public int compareTo(Object o)
	{
		if(o instanceof Person)
		{
			Person p = (Person)o;
			return this.numberOfPhones - p.numberOfPhones;
		//return  (this.name+this.numberOfPhones).compareToIgnoreCase(p.name+p.numberOfPhones) ;
			//return (this.name).compareTo(p.name);
		}
		else
		{
			throw new IllegalArgumentException("sorryt wng inptt");
		}
		
	}
	
	String name;
	int numberOfPhones;
	
	public Person(String name, int phn) {
		super();
		this.name = name;
		this.numberOfPhones = phn;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
 public	String toString()
	{
		return "Person {name ="+name+" phone = "+numberOfPhones+"}";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Person)
		{
			Person p = (Person)o;
			if (  (this.name).equalsIgnoreCase(p.name)  &&  (this.numberOfPhones)==(p.numberOfPhones) )
			{
				return true;
			}
			else
				return false;
		}
		
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		int hs;
		hs = ( (name + numberOfPhones) ).hashCode(); 
		return hs;
		
	}

	
	

}
