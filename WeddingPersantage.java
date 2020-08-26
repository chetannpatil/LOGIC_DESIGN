package logicDesign;

import java.util.Scanner;

public class WeddingPersantage {

	public static void main(String[] args) {
	
		String strCoupled ="";
		int count = 1;
		//redaing names 
		System.out.println("ENTER BOY's NAME {strictly only firstname}");
		String strMale = new Scanner(System.in).next();
		
		System.out.println("ENTER GIRL's NAME {strictly only firstname}");
		String strFemale = new Scanner(System.in).next();
		
		System.out.println("Select which one  U want check for from follwing two option");
		System.out.println("1."+strMale+" Weds "+strFemale+" 's % ?");
		System.out.println("OR");
		System.out.println("2."+strFemale+" Weds "+strMale+" 's % ?");
		int intOption = new Scanner(System.in).nextInt();
		
		if(intOption==1)
			 strCoupled = strMale.trim()+"weds"+strFemale.trim();
		else
			strCoupled = strFemale.trim()+"weds"+strMale.trim();
		

		//adding all chars to char array to get first int array of occurrence of each letter in strcoupled
		
		char ca[] = strCoupled.toCharArray();
		
		//define one int array to hold all lettrs numbr of ocuurnces
		
		int ia [] = new int [ca.length];
	
	
		outer: for (int i=0;i<strCoupled.length();i++)
		 {
			
		
			if(i==strCoupled.length()-1)
			{
				if(ca[i]=='1')
				break;
				ia[i] = count;
				
			}
			if(ca[i]=='1')
			{
		
				continue outer;
				
			}
			inner:for (int k=i+1 ; k<strCoupled.length();k++)
			{
				
				//check is It alredy visited value of K?
				if(ca[k]=='1')
				{
					
					
					if(k==strCoupled.length()-1)
					{
						
						ia[i]=count;
				
					continue outer;
					}
					else
					{
				
					continue inner;
					}
				}
				//checkig is it end of k?
				if(k==strCoupled.length()-1)
				{
					
					if(ca[i]==ca[k])
					{
						
						count++;
				
						ca[k]='1';
					}
				
					ia[i]=count;
				
					count = 1;
		
					continue outer;						
				}
				else
				{
					
					if(ca[i]==ca[k])
					{		
		
					count++;
		
					ca[k]='1';
					}
				}
			}
		    //end innerFor
			 
		 }
		 //end ouerFor
		 
		 //firt line iof int of intarray
		 
		 //skipping 0zerod elemnts
		 int intZeroCount=0;
		 for(int m=0;m<ia.length;m++)
		 {
			 if(ia[m]==0)
				 intZeroCount++;
			 
		 }

		 //create new intArray to hole new only letterd nmbrs
		 int ia2[] = new int [ia.length-intZeroCount];
		
		
		 //copy paste ia value to ia2 by removing zeros from ia
		
			 
		for(int t = 0,u=0; t<ia.length ; t++)	 
		{
			if(ia[t] != 0)
				ia2[u++]=ia[t]; 
		}
		 //display new ia2

		// System.out.println("");
		 for (int w=0;w<ia2.length;w++)
		 System.out.print(ia2[w]+" ");
		 
		 String strRes = Persantage.getPersantage(ia2);
		 
		 System.out.println("");
		 System.out.print("");
		 if(intOption==1)
		 System.out.println("The chances of "+strMale+" gettig married to "+strFemale+" is "+strRes);
		 else
			 System.out.println("The chances of "+strFemale+" gettig married to "+strMale+" is "+strRes); 
		 
	}

}
