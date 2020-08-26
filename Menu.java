package others;

import java.util.Scanner;

public class Menu {
	static Scanner sc1 = new Scanner(System.in);
	static Scanner scLine = new Scanner(System.in);
	
	private static void m1()
	{
		int ch=0;
		while(ch !=6 )
		{
			System.out.println(":enter input submenu");
			System.out.println("1 2 3 4 5 6");
			ch=sc1.nextInt();
			switch (ch) {
			case 1:System.out.println("in 1");
				break;
			case 2:System.out.println("in 2");break;
			case 3:System.out.println("in 3");break;
			case 4:System.out.println("in 4");break;
			case 5:System.out.println("in 5");break;
			case 6:System.out.println("in 6 see u tq");break;
				
				

			default:System.out.println("incrrcrt");
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int ch1=0;
		
		while(ch1 !=4 )
		{
			System.out.println(":enter input MIAnEy");
			System.out.println("1 2 3 4 ");
			ch1=sc1.nextInt();
			switch (ch1)
			{
			case 1:System.out.println("--------------------in mian 1");
				m1();
				break;
			case 2:System.out.println("-------------------in mian 2");
				m1();
				break;
			case 3:System.out.println("-------------------in mian 3");break;
			case 4:System.out.println("-------------good bye------in mian 4");break;	
	
			default:System.out.println("incrrcrt");
				break;
			}
		}
		

	}
}
