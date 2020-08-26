package oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpDetaInputstreamreadr {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader i1 = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(i1);
		
		System.out.println("Enter age f emplyee");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter sex f emplyee");
		char sex = (char)br.read();
		br.skip(2);
		System.out.println("Enter name f emplyee");
        String name = br.readLine();
        
       System.out.println("EMPLYE DETAILS ARe");
       System.err.println("age "+age);
       //System.out.println("sex "+sex.charAt(0));
       System.out.println("SEX "+sex);
       System.err.println("name "+name);
	}

}
