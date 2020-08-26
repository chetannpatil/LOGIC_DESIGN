package myString;

public class DisplayDictionaryWord {

	private static void displayWordInHumanReadableFormate(String s)
	{
		if( s != null && s.length() != 0)
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
	
		for(int k=0;k<meaningSA.length-1;k++)
		{
			String [] posSA = meaningSA[k].split(">");
			String posStr = posSA[0];
		
			String [] meanSA = posSA[1].split("<");
			String meanStr = meanSA[0];
			String exmStr = meanSA[1].substring(0, meanSA[1].length());
			StringBuilder sbExam = new StringBuilder();
			for(int p=0;p<exmStr.length();p++)
			{
				if(exmStr.charAt(p)=='%')
					break;
				sbExam.append(exmStr.charAt(p));
			}
			System.out.println(posStr);
			System.out.println("     MEANING = "+meanStr+", EXAMPLE = "+sbExam.toString());
			
		}
		System.out.println("");
		String dispStr =  "date Of additon/Modification  of ";
System.out.println(dispStr.toUpperCase()+"\""+wordStr+"\" = "+dateStr);
	System.out.println("---------------------------------------------------------------------------------------");	
		}	
		
	}
	public static void main(String[] args) {

		try
		{	
		String inString = "HISSAB=VERB>opinion<mere hissab se wo nahi ho sakta hai thumse#NOUN>quantity or part<ismai hamara hissab kitna hoga#%Thu Jan 12 11:39:04 IST 2017";

		displayWordInHumanReadableFormate(inString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
