package c;

class Parent{
	public Parent() {
		System.out.println("parent cnstrct");
	}
	
	public void methd()
	{
		System.out.println("parent");
	}
}
public class SuperEx extends Parent{

	public SuperEx(int a) {
		System.out.println("child  arg cnstrct"+a);
	}
	
	public SuperEx()
	{
		//super();
		System.out.println("Child no arg cnstr");
	}
	public void methd()
	{
	  super.methd();
		System.out.println("child");
	}
	public static void main(String[] args) {
		

		SuperEx s1 = new SuperEx(69);
		s1.methd();
		
		/*Parent p1 = new Parent();
		p1.methd();*/
		
		
	}

}
