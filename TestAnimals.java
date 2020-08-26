package batch81lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*1) Animals can eat,sleep and dance(eat and dance are abstract). 
Hippo,tiger,croc etc are animals. All animals live in a zoo.
When you add an animal to the zoo, it keeps track of the count.
Every animal has name and id. Every zoo has a name. 
A vet can treat animals. When you ask the vet to visit the zoo,
he treats all animals. When an animal is treated, it dances, eats and sleeps.
Write a tester class to test various operations on zoo,vet and the animals.
2) A Hippo has a name and tailLength.
We want to compare 2 Hippos based on length of its tail.
Return -ve,0,+ve depnding on the tail lengths.
How to compare 2 hippos based on name?*/

public class TestAnimals
{

	public static void main(String[] args) 
	{

		Vet v = new Vet();
		Zoo z = new Zoo();
		v.treat(z);
	}

}
abstract class Animal
{
	String name ,id;
	
	public abstract void eat();
	public void sleep(){
		System.out.println("this is "+this+" * Ia mgoing to  sleep... good night");
	}
	public abstract void dance();
	
}
class Hippo extends Animal implements Comparable<Hippo>
{
/*	2) A Hippo has a name and tailLength.
	We want to compare 2 Hippos based on length of its tail.
	Return -ve,0,+ve depnding on the tail lengths.
	How to compare 2 hippos based on name?*/
	int tailLengthInt ;
	@Override
	public void eat() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is "+this+" & eating ");
	}

	@Override
	public void dance()
	{
		System.out.println("This is "+this+" & dancing ");
	}

	@Override
	public int compareTo(Hippo h)
	{		
     return (this.name.compareToIgnoreCase(h.name));
	}
	
}
class TailLengthComparator implements Comparator<Hippo>
{

	@Override
	public int compare(Hippo h1, Hippo h2) 
	{	
		return (h1.tailLengthInt - h2.tailLengthInt);
	}
	
}

class Croco extends Animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
	
}

class Tiger extends Animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
	
}


class Zoo
{
	String name;
	int countOfAnimalsInt;
	List<Animal> aniamlsList = new ArrayList<Animal>();
	
	public boolean addAnimal(Animal a)
	{
		if(aniamlsList != null)
		{
			if(aniamlsList.add(a) == true )
				return true ;
			else
				return false ;
		}
		return false ;
	}
}


class Vet
{
	void treat(Zoo z)
	{
		//d e sl
		if(z != null)
		{
			if(z.aniamlsList != null )
			{
				if(z.aniamlsList.size() > 0)
				{
					for(Animal a :z.aniamlsList)
					{
						a.dance();
						a.eat();
						a.sleep();
					}
				}
				else {
					System.out.println("there are no animals in zoo to traet for now ..let ur Vet to return quitelly :)");
				}
			}
		}
	}
	void visitZoo( Zoo z)
	{
		treat(z);
	}
}

















