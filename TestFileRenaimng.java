package others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileRenaimng {

	//static String temppathOfDictionaries="//media//chetan//WORK//CORE_JAVA_BEST_PRACTISE//C_Dictionary//YOUR_DICTIONARIES";
		static String pathOfDictionaries="//media//chetan//WORK//CORE_JAVA_BEST_PRACTISE//C_Dictionary//U";
		static File file= new File(pathOfDictionaries);
		static String nameOfDictionary;
		static Scanner sc1 = new Scanner(System.in);
		static Scanner scLine = new Scanner(System.in);
		static  File userFile;
		static FileWriter fosOfCurrentDict;
		static BufferedReader br;
		static BufferedWriter bw;
		static FileReader fr;
		static FileWriter fw;
	public static void main(String[] args) throws IOException
	{
		System.out.println("hi enetr name of file");
		String n = new Scanner(System.in).next();
		file = new File(pathOfDictionaries+"//"+n);
		if(file.exists())
			System.out.println("yes");
		else
			System.out.println("no");
	
		
		String editPath = file.getAbsolutePath();
		String canPath = file.getCanonicalPath();
		System.out.println(editPath);
		System.out.println(canPath);
		
		fr= new FileReader(file);
		br= new BufferedReader(fr);
		int k=0;
		String line="";

		
		while( ( line=br.readLine() ) != null )
		{
			k++;
		}
		
		//	if(br==null)
		//System.out.println("yes br=null");
		
		String sa[] = new String[k];
		System.out.println("length o sa="+sa.length);
		int p=0;
		fr= new FileReader(file);
		br= new BufferedReader(fr);
		while( ( line=br.readLine() ) != null )
		{
			System.out.println("line "+p+" = "+line);
			sa[p++] = line;
		}
		int m=0;
		for(String s:sa)
			System.out.println((m++)+" = "+s);
		
		if(file.delete())
		{
			System.out.println("yes file "+file+ " deleted");
		}
		else
			System.out.println(" file "+file+ " NOT deleted");
		fw = new FileWriter(editPath);
		
		bw = new BufferedWriter(fw);
		System.out.println("enter string to delete");
		String deletStr = new Scanner(System.in).next();
		if(bw != null)
		{
			for(String s:sa)
			{
				if(s.equalsIgnoreCase(deletStr))
					continue;
				bw.write(s);
				bw.newLine();
					
			}
		}
		bw.flush();
		fr= new FileReader(editPath);
		br = new BufferedReader(fr);
		System.out.println("conrnts");
		while( ( line=br.readLine() ) != null )
		{
			System.out.println("line "+p+" = "+line);
			//sa[p++] = line;
		}

	}

}
