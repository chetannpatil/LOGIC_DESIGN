package colections;

import java.util.Scanner;

public class ArrayOfObjects {

	private int age;
	private String name;
	private char gender;
	public ArrayOfObjects(int a,String n,char g)
	{
		age = a;
		name = n;
		gender = g;
		
	}
	
	void display()
	{
		System.out.println();
		System.out.println(age+"is age");
		System.out.println(name +" is name");
		System.out.println(gender+" is geder " );
	}
	public static void main(String[] args) {
		
		System.out.println("enter 2 emplyee detailss as age name  geder");
		
		ArrayOfObjects  [] arObj = new ArrayOfObjects[2]; 
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		char gender;		
		
	
		for(int i =0; i<2;i++)
		{	
		
			
			System.out.println("enter name  emp no "+i);
			name = sc.next();
			System.out.println("enter gender  emp no "+i);
			gender = sc.next().charAt(0);
			
			System.out.println("enter age of  emp no "+i);
			age=sc.nextInt();
			
			ArrayOfObjects a = new ArrayOfObjects(age, name, gender);
			arObj[i] = a;
			
		}
		   sc.close();
		//System.out.println("the emp detila su enreed are");
		/*for(int i =0; i<2;i++)
		{
			System.out.println("the details of emp no "+i+" are ");
			//arObj[i].display();
			
			System.out.println(arObj[i].age);
			System.out.println(arObj[i].gender);
			System.out.println(arObj[i].name);
		}*/
		for (ArrayOfObjects a1 : arObj) {
			
			System.err.print(a1.name);
			System.out.print(a1.age);
			System.out.print(a1.gender);
			System.out.println();
		}
		
	}

}
