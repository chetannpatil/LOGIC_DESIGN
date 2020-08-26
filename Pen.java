package innerClass;

public class Pen extends Device
{

	int inkQuantityInt ;
	String colourStr ;
	
	public void write(String textStr)
	{
		if(this.inkQuantityInt > 0 )
		{
			System.out.println(textStr);
		}
		else
		{
			System.out.println("sorry no more ink available in pen to write ur text .. plesea re-fill pen & try again");
		}
	}
	
	public void refill(int inkInt)
	{
		if(inkInt > 0)
		{
			this.inkQuantityInt = this.inkQuantityInt + inkInt ;
			System.out.println("Ur pen is been refilled with "+inkInt+" amont of ink ..now u can wirte :)");
		}
		
		else
			System.out.println("No worth of adding zero/negative inkQuantity");
	}

	public static void main(String ...a)
	{
		Pen p1 = new Pen();
		//calling write
		p1.write("gm");
		
		//now adad ink 
		p1.refill(0);
		
		//now add corrct ink
		
		p1.refill(24);
		
		//write
		p1.write("helllo vickya");
	}
}
