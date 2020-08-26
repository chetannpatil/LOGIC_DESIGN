package oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrngToknzer {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter age f emplyee ,sex f emplyee,name f emplyee,salary f emlyee");
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(iobj);
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1," ");
		
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		String s5 = st.nextToken();
		
	/*	s2.trim();
		s3.trim();
		s4.trim();
		s5.trim();*/
		int age = Integer.parseInt(s2);
		char sex = s3.charAt(0);
		String name = s4;
		float salary = Float.parseFloat(s5);
	     
	       System.out.println("EMPLYE DETAILS ARe");
	       
	       System.out.println(" NAme "+name);
	       System.out.println("age "+age);
	       System.out.println("sex "+sex);
	       System.out.println("salary "+salary);
		
		
	}

}
