package myString;

import java.util.ArrayList;
import java.util.Scanner;

public class AntykshariByOthers {

	public static ArrayList<String> AnthaksharyOfWords(ArrayList<String> words)
{
String temp=words.get(0);
	ArrayList<String> al=new ArrayList<String>();	
	al.add(temp);
	
	for(int i=1;i<words.size();i++)
	{
		for(int j=0;j<words.size();j++)
		{
			if(temp.charAt(temp.length()-1)==words.get(j).charAt(0))
			{
				al.add(words.get(j));
				temp=words.get(j);
                                    break;

			}
		}
	}
	
	return al;
}
		
	public static void main(String[] args) {
		try
		{
			//chetan geetha divya preeti nirmal lavany
			System.out.println("ENTER FEW  WORDS");
			String inputStr = new Scanner(System.in).nextLine();
			ArrayList<String> words = new ArrayList<String>();
			String [] sa = inputStr.split(" ");
			for(String s:sa)
				words.add(s);
			System.out.println("-----------------------------------------------joined str is =");
			//ArrayList<String> resAl = AnthaksharyOfWords(words);
			//System.out.println(resAl);
			System.out.println(AnthaksharyOfWords(words));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
