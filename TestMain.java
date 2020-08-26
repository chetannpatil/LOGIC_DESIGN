package others;
/*package jvm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class TestMain {
	
	//static String pathOfDictionaries="//media//chetan//WORK//CORE_JAVA_BEST_PRACTISE//C_Dictionary//YOUR_DICTIONARIES";
	static String pathOfDictionaries="//media//chetan//WORK//CORE_JAVA_BEST_PRACTISE//C_Dictionary//U";
	static File file= new File(pathOfDictionaries);
	static String nameOfDictionary;
	static Scanner sc1 = new Scanner(System.in);
	static Scanner scLine = new Scanner(System.in);
	static  File userFile;
	private static void repeatUntilLineislettersCol()
	{
		while( (!scLine.hasNext()) )
		{
			System.out.println("Enter ony Letters pls ,TQ");
			scLine.nextLine();
		}
	}
	public static boolean isThereDictionaries()
	{	
		if(file != null)
    {
File []fa =file.listFiles();
if(fa.length==0)
return false;
else
return true;
    }
else
return false;
	}
	
	private static void displayContentsOfDict(FileReader fr, File uf) throws IOException
	{
		
		if(fr != null)
		{
			if(uf.length() != 0)
			{
				BufferedReader br = new BufferedReader(fr);
				String line="";
				int k=1;
				while( (line=br.readLine()) != null)
				{
					String [] wordSa= line.split("=");
					String [] posSa = line.split(":");
					
					System.out.println("WORD "+k+" =[ "+line+" ]");
					System.out.println();
					k++;
				}
			}
			else
				System.out.println("There r zero words to show in ur Dictionary "+nameOfDictionary);
			
			
		}

	}
	
	void addpos()
	{
		int chOfPOS=0;
		posList = new ArrayList<String>();
		meanList = new ArrayList<String>();
		exampList = new ArrayList<String>();
		while(chOfPOS != 9)
		{
			
			System.out.println("Seelect 1 of Part of speeach from below to add to ur "+wordStr+" along with 1 meaning & 1 example");
			System.out.println("1  VERB");
			System.out.println("2  NOUN");
			System.out.println("3  PRONOUN");
			System.out.println("4  ADJECTIVE");
			System.out.println("5  CONJUCTION");
			System.out.println("6  PREPOSITION");
			System.out.println("7  POS-7");
			System.out.println("8  POS-8");
			System.out.println("9  Go BaCK ?");
			repeatEntryUntilItisInt();
			chOfPOS = sc1.nextInt();
			switch (chOfPOS) {
			case 1:posList.add("VERB");
			
				System.out.println("add  VERBal meaning for ur "+wordStr);
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				 
				break;	
				
			case 2:
				posList.add("NOUN");
				
				System.out.println("add  noun meaning for ur "+wordStr);
			
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
				
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				 
				break;
				
			case 3:
				posList.add("PRO-NOUN");
				
				System.out.println("add  PRO-NOUN meaning for ur "+wordStr);
				
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
		
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				 
				break;
				
			case 4:
                 posList.add("ADJECTIVE");
				
				System.out.println("add  ADJECTIVE meaning for ur "+wordStr);
	
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
			
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				
				break;
				
			case 5:
                posList.add("CONJUCTION");
				
				System.out.println("add  CONJUNCTION meaning for ur "+wordStr);
			
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
				
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				break;
				
			case 6:
                 posList.add("PREPOSITION");
				
				System.out.println("add PREPOSITION meaning for ur "+wordStr);
				
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
	
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				break;
				
			case 7:
                posList.add("POS-7");
				
				System.out.println("add  POS-7 meaning for ur "+wordStr);
		
				meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
				
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				break;
				
			case 8:
                 posList.add("POS-8");
				
				 System.out.println("add  PPOS-8 RO-NOUN meaning for ur "+wordStr);
		
			 	 meanStr = scLine.nextLine();				 
				 validateMeanAndexamp(meanStr);
				 meanList.add(meanStr);
				 
				 //example input
				 System.out.println("Pls Add a example for "+meanStr+" of ur "+wordStr);
			
				 exampStr = scLine.nextLine();				
				 validateMeanAndexamp(exampStr);
				 exampList.add(exampStr);
				break;
				
			case 9:
				System.out.println("___________back ?_________ok i ll write ur data to HDD TQ");
			
				StringBuilder oneWordSB = new StringBuilder(wordStr+"=");
				int i=0;
				int totalPOS = posList.size();
				//System.out.println("theer are total "+totalPOS);
				while( !posList.isEmpty() )
			      {
					
					//oneWordStr=oneWordStr+posList.get(i)+":"+meanList.get(i)+":"+exampList.get(i)+"::";
					oneWordSB.append(posList.get(0)+":"+meanList.get(0)+":"+exampList.get(0)+"::");
					posList.remove(0);
					meanList.remove(0);
					exampList.remove(0);
					//System.out.println(posList.get(i)+":"+meanList.get(i)+":"+exampList.get(i)+"::");
					i++;
			      }
				Date dateOfAddition = new Date();
				oneWordSB.append(":"+dateOfAddition);
				//System.out.println("SB = "+oneWordSB.toString());
		
				if(fw != null)
				{
				    bw = new BufferedWriter(fw);
				      
					bw.write(oneWordSB.toString());
					bw.newLine();
				}
				bw.flush();
				//fosOfCurrentDict.flush();
				break;
				

			default:System.out.println("Pls enter only Numbers within 1 to 9,TQ");
				break;
			}
	}
	//}

	//public static void main(String ... a);
	//{
		
		//if(isThereDictionaries())
		//{
			System.out.println("enter one dictionary's name  & enter to Delete it TQ");
			nameOfDictionary=scLine.nextLine();
			userFile = new File(pathOfDictionaries+"//"+nameOfDictionary);
			System.out.println("length f file "+userFile+" === "+userFile.length());
			//System.out.println("deletng "+userFile.delete());
			//System.out.println("deltin folder "+file.delete());
		//}
		
		//System.out.println("isThereDictionaries()="+isThereDictionaries());
		System.out.println("enetr name of file");
		String line =new Scanner(System.in).nextLine();
		String [] wordSa= line.split("=");
		String [] posSa = line.split(":");
		System.out.println("words");
		int i=1;
		for(String s:wordSa)	
					System.out.println((i++)+" = "+s);
		
		System.out.println("_________________________pos:");
		int k=1;
		for(String s:posSa)
			System.out.println((k++)+" = "+s);
		
		//preeti=VERB:pyar:pyar kiya toh darna kyon::NOUN:i dont know:really i donno::PREPOSITION:gottilla:hmmmmmm tq:::Mon Dec 26 14:01:25 IST 2016
		//repeatUntilLineislettersCol();
		//nameOfDictionary= 
		
		// File userFile = new File(pathOfDictionaries+"//"+nameOfDictionary);
		 
		 if(userFile.exists())
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("no");
		 }
		//System.out.println(new Date());
		List<String>  poslist  = new ArrayList<String>();
		
		System.out.println(poslist);
		
		System.out.println(":adding "+poslist.add("verb"));
		System.out.println(":adding "+poslist.add("verb"));
		System.out.println(":adding "+poslist.add("verb"));
		
		System.out.println("all= "+poslist);
		//System.out.println("pos.get0 "+poslist.get(0));
		System.out.println("size="+poslist.size());
		int i=0;
		StringBuilder sb1 = new StringBuilder();
		
		
		
		System.out.println("poslist.remove(0) "+poslist.remove(0));
		System.out.println("poslist.remove(1) "+poslist.remove(0));
		System.out.println("poslist.remove(2) "+poslist.remove(0));
		
		while(!poslist.isEmpty())
		{
			sb1.append(i+" = "+poslist.get(0));
			poslist.remove(0);
			System.out.println("hi");
			i++;
		}
		System.out.println("sb="+sb1);
		
		
	System.out.println("inside while for i= "+i);
 * System.out.println("poslist= "+posList);
				System.out.println("manlist "+meanList);
				System.out.println("exmls "+exampList);
 * System.out.println("adding verb = "+posList.add("VERB"));
		System.out.println("poslist= "+posList);
		System.out.println("manlist "+meanList);
		System.out.println("exmls "+exampList);
	//}
	
	
}
*/