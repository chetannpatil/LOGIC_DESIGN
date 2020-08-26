package batch81lab;

class Fish
{
	String name;
}
public class Croc 
{
	String name;
	public void eat(Fish f)
	{
		System.out.println("i am croc with name "+this.name+" & i m eating fish "+f.name);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Fish f1 = new Fish();
		f1.name = "fishy";
		Croc c1 = new Croc();
		c1.name = "cocky";
		System.out.println("fish name = "+f1.name);
		c1.eat(f1);
		System.out.println("fish name = "+f1.name);

	}

}


