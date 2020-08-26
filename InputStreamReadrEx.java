package oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReadrEx {

	public static void main(String[] args) throws IOException {
		
		//System.err.println("enter 1 letter");
		InputStreamReader iObj = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(iObj);
		
		char ch ;
		//ch = (char)br.read();
		
		//System.err.print(ch);
		
	/*	System.out.println("enter 1 string");
		
		String s1 = br.readLine();
		
		System.out.println(s1);*/
		
	/*	System.out.println("enter an integer");
		
		String w =  br.readLine();
		
		int q=Integer.parseInt(w);
		System.out.println(q);*/
		System.err.println("enter boolean");
		String w = br.readLine();
		 //float f = Float.parseFloat(w);
		//double f = Double.parseDouble(w); 
		//byte f = Byte.parseByte(w);
		//short f = Short.parseShort(w);
		//long f = Long.parseLong(w);
		boolean f = Boolean.parseBoolean(w);
		System.out.println(f);

	}

}
