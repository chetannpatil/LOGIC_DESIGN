package myString;

import java.util.Scanner;

public class TestStrin {

	public static void separate(String s)
	{
		System.out.println("______________________________________________________________________________________");
		String [] wordSA = s.split("=");
		String wordStr = wordSA[0];			
		//here
		String collOfMenaEXmStr=  wordSA[1];
		String meaningSA [] = collOfMenaEXmStr.split("#");			
		
		String dateSA []  = wordSA[1].split("%");
		String dateStr = dateSA[1];

		System.out.println(wordStr);
		
		for(int k=0;k<meaningSA.length;k++)
		{
			String [] posSA = meaningSA[k].split(">");
			String posStr = posSA[0];
			String [] meanSA = posSA[1].split("<");
			String meanStr = meanSA[0];
			String exmStr = meanSA[1].substring(0, meanSA[1].length()-1);
			StringBuilder sbExam = new StringBuilder();
			for(int p=0;p<exmStr.length();p++)
			{
				if(exmStr.charAt(p)=='%')
					break;
				sbExam.append(exmStr.charAt(p));
			}
			System.out.println(posStr);
			System.out.println(" meaning = "+meanStr+", exmple = "+sbExam.toString());
			
		}
		System.out.println("");
		String dispStr =  "date Of additon/Modification  of ";
System.out.println(dispStr.toUpperCase()+"\""+wordStr+"\" = "+dateStr);
	System.out.println("---------------------------------------------------------------------------------------");	
	}
	public static void main(String[] args) {
		try
		{
		//String	inputStr = "Project=noun>Meaning1<example1#Verb>meaning2<example2%Wed Dec 28 15:53:39 IST 2016";
		String inString = "HISSAB=VERB>opinion<mere hissab se wo nahi ho sakta hai thumse#NOUN>quantity or part<ismai hamara hissab kitna hoga#%Thu Jan 12 11:39:04 IST 2017";
		//String in2Str = "Project=noun:Meaning1:example1::Verb>meaning2<example2#";
		separate(inString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
