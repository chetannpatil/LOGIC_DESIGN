package oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		leap yar means:
			1.a CENTURY year & year divisoble by 400
			     OR
			2. Not century yera & dvsbl eby 4 */
			
		System.out.println("ENTER A YEAR ");
		
		InputStreamReader iObj = new InputStreamReader(System.in);
		
		BufferedReader brObj = new BufferedReader(iObj);
		
		int year = Integer.parseInt(brObj.readLine());
		
		if (year % 400==0 && year % 100 ==0)
			System.out.println("YeS its a LEAP YEAR");
		else if (year % 100 != 0 && year%4 ==0)
			System.out.println("YeS its a LEAP YEAR");
			
		else
			System.out.println("NO");
		
	}

}
