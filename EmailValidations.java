package others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmailValidations {
	 //validate emial
	  private static void validateEmail(String emailStr)
	  {
		  if(emailStr == null)
			  throw new IllegalArgumentException("EMAIL CAN NOT BE BLANK");
		  if(emailStr.trim().length() == 0)
			  throw new IllegalArgumentException("EMAIL CAN NOT BE EMPTY/BLANK");
		  if((emailStr.contains("@") == false) || (emailStr.contains(".") == false))
			  throw new IllegalArgumentException("INVALID EMAIL");
		  if(emailStr.charAt(0) == 46)
			  throw new IllegalArgumentException("INVALID EMAIL");
			 
		  
		  StringBuilder sb = new StringBuilder(emailStr.trim().toLowerCase());
		  //chhecking first half 
		  String [] saAtTheRate = sb.toString().split("@");
		  //if not two parts
		  if(saAtTheRate.length != 2)
			  throw new IllegalArgumentException("INVALID EMAIL");
		  String firstHalfStr = saAtTheRate[0];
		  String secondHalfStr = saAtTheRate[1];
		  validateForlettersNumericNDot(firstHalfStr);
		  validateForlettersNumericNDot(secondHalfStr);
		  if( (firstHalfStr.trim().length() == 0) || ( secondHalfStr.trim().length() == 0) )
			  throw new IllegalArgumentException("INVALID EMAIL");
		  if(secondHalfStr.contains(".") ==  false )
			  throw new IllegalArgumentException("INVALID EMAIL");
		//  System.out.println("secn hf = "+secondHalfStr+" lengh = "+secondHalfStr.length());
		  //System.out.println("secn hlf cntcns . = "+secondHalfStr.contains("."));
		  String [] saDot = secondHalfStr.split("\\."); 
		/*  for(String s: saDot)
			  System.out.println(s);*/
		  if(saDot.length < 2 )
		  {
			 // System.out.println("length = "+saDot.length);
			  throw new IllegalArgumentException("INVALID EMAIL");
		  }
		
		  
	  }
	  //checkfor numbers dot letters
	  private static void validateForlettersNumericNDot(String validStr)
	  {
		  StringBuilder sb = new StringBuilder(validStr.trim().toLowerCase());
		  for(int i=0 ; i<sb.length() ;i++)
		  {
			  char chValid = sb.charAt(i);
			  if((chValid == 46) || (chValid >= 48 && chValid <= 57) || (chValid >= 97 && chValid <= 122) ||(chValid == 95))
			  {
				  //acceptable
			  }
			  else
				  throw new IllegalArgumentException("INVALID EMAIL");  
		  }
		 
	  }
	public static void main(String[] args) {
		 //System.out.println("enter email");
		 // String str = new Scanner(System.in).nextLine();
		String str = "chetan.is@yahoo.co.in";
		String [] sa = str.split("\\.");
		for(String s: sa)
			System.out.println(s);

		char ch = '/';
		System.out.println((int)ch);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1;
		try {
			dt1 = sdf.parse("30/00/1989");
			
			//dt1.
			System.out.println(dt1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
