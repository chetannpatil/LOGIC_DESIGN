package oi;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("EnTER name age saly gender");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		int age = sc.nextInt();
		
		float salay = sc.nextFloat();
		
		char gender = sc.next().charAt(0);
		
		System.out.println("deatils are as foolws");
		System.out.println(name);
		System.out.println(age);
		System.out.println(salay);
		System.out.println(gender);
	}

}
