package batch81lab;
/*
1) Create a Duck. A Duck has a tailSize (int). A Duck can swim.
When you ask a Duck to swim, it says so (print to monitor). Design
and test Duck class usage as we did for Hippo.*/
public class Duck 
{
	private int tailSizeInt ;
	
	

	public int getTailSizeInt() {
		return tailSizeInt;
	}



	public void setTailSizeInt(int tailSizeInt) {
		this.tailSizeInt = tailSizeInt;
	}


	public Duck() {
		// TODO Auto-generated constructor stub
	}
	public Duck(int size)
	{
		
		tailSizeInt = size ;
	}

	public void swim()
	{
		System.out.println("I am qute Duck & I am swimming ...wanna join me ???? :)");
	}
	
	public static void main(String[] args) 
	{
		
Duck d1 = new Duck() ;
d1.swim();

	}

}
