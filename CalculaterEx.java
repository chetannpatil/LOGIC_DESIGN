package oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculaterEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("enter two numbersin th format num1 num2 ");
		
		InputStreamReader inObj = new InputStreamReader(System.in);
		
		BufferedReader brObj = new BufferedReader(inObj);
		
		/*System.out.println("enter first nmb");
		double num1 = Double.parseDouble(brObj.readLine());
		
		System.out.println("enter second nmb");
		double num2 = Double.parseDouble(brObj.readLine());*/
		
		//tokenizer
		
		String readString = brObj.readLine();
		StringTokenizer st = new StringTokenizer(readString," ");
		
		String s1 = st.nextToken();
		
		String s2 = st.nextToken();
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		double sum = num1+num2;
		System.out.println("addition :"+sum);
		double diff =num1-num2;
		double mul = num1*num2;
		double div = num1/num2;
		System.out.println("subtrctn is :"+ diff);
		
		System.out.println("multplcn "+mul);
		System.out.println("dicivsn is "+div);
		

	}

}
