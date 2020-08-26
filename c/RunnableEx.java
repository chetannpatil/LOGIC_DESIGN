package c;

public class RunnableEx implements Runnable{
	
	//@Override
	public void run()
	{
		System.out.println("inside run ");
	}

	public static void main(String[] args) {
		System.out.println("first line f main");
		Runnable r1 = new RunnableEx();
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("last of MAiN");
		
	}

}
