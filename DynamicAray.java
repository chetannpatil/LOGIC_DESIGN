package logicDesign;

import java.util.Scanner;

public class DynamicAray {

   ///sinle?
	public static boolean isSingleDigitAray(int ia[])
	{
		
		for (int i =0;i<ia.length;i++)
		{
			if(ia[i]>9)
				return false;
		}
		return true;
	}
	
	
	//Split()]
	public static int [] splitToSigleDigitAray(int ia[])
	{
		String s1 = "";
		for (int k=0;k<ia.length;k++)
		{
			s1=s1+ia[k];
		}
		//adding ti charct array
		char ca[] = s1.trim().toCharArray();
		//define ia2 [] to hold int values of ca ,with length same as ca[]
		int ia2 [] = new int [ca.length];
		
		for (int k=0;k<ca.length;k++)
		{
			//System.out.println("inside for k= "+k+" and value is "+ca[k]);
		//	System.out.println("ca["+k+"] ="+ca[k]);
			int z = ca[k];
		//	System.out.println("z= "+z);
			switch (z)
			{
			case 48:	ia2[k] = 0;
			//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+0);
			break;
			case 49:
			//	System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+1);
				ia2[k] = 1;break;
			case 50:
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+2);
				ia2[k] = 2;break;
			case 51:
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+3);
				ia2[k] = 3;break;
			case 52:	
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+4);
				ia2[k] = 4;break;
			
			case 53:
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+5);
				ia2[k] = 5;break;
			case 54:	
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+6);
				ia2[k] = 6;break;
			case 55:	
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+7);
				ia2[k] = 7;break;
			case 56:
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+8);
				ia2[k] = 8;break;
			case 57:
				//System.out.println(ca[k]+" is value at ca["+k+"] ...so ia2["+k+"] repld by "+9);
				ia2[k] = 9;break;

			default:
				System.out.println("control in default with ca[k]= "+ca[k]);
				break;
			}
		   //swicth ends
			
		}
		//for ends
		
		return ia2;
	}
	
	
	
	//get%()
	public static String strPercentage;
	//public static StringBuilder sb ;
	//public static int end;
	public static String getPersantage(int ia[])
	{
		
		int newIaM[] = new int [ia.length];
		for(int p=0;p<ia.length;p++)
		{
			newIaM[p]=ia[p];
		}
		if(isSingleDigitAray(newIaM))
		{
			System.out.println("okay");
			//end =ia.length-1;
		}
	    
		else
		{
			ia = splitToSigleDigitAray(newIaM);
			//end = ia.length -1;
		}
	     for(int i:ia)
		System.out.print(i+" ");
		
	//	System.out.println("end "+end);
		
		
	w:while(ia.length >= 2)
		{
	
			//System.out.println("insie while at end "+end);
		 enLop:	for (int i = 0;i<ia.length-1;i++)
			{
			 System.out.println("_______________________________________________");
			 System.out.println("inside for i= "+i);
				if(   i >  ((ia.length-1)-i))
				{
					//System.out.println(i+" > end-i "+(end-i));
				//	end = (i-1);
					 System.out.println("");
					 System.out.print("");
					for(int p=0;p<ia.length-1;p++)
					{
						System.out.print(ia[p]+" ");
					}
					int newIa[] = new int [ia.length];
					for(int p=0;p<ia.length;p++)
					{
						newIa[p]=ia[p];
					}
					if( !(isSingleDigitAray(newIa)) )
							{
						ia = splitToSigleDigitAray(newIa);
						//end = ia.length-1;
						continue w;
							}
				continue w;
					
				}
				if(   i == ( (ia.length-1) -i)  )
				{
					//System.out.println(" {i== end-i} i.e ("+end+"-"+i+") = "+(end-i));
					System.out.println("ia["+i+"] ="+ia[i]);
					//ia[i] = 
					//end = i ;
					 System.out.println("");
					 System.out.print("");
					for(int p=0;p<ia.length-1;p++)
						System.out.print(ia[p]+" ");
					int newIa[] = new int [ia.length];
					for(int p=0;p<ia.length;p++)
					{
						newIa[p]=ia[p];
					}
					if( !(isSingleDigitAray(newIa)) )
							{
						ia = splitToSigleDigitAray(newIa);
						//end = ia.length-1;
						continue w;
							}
				continue w;

				}
				//System.out.println("ia["+i+"]= ia["+i+"] + ia["+ia.length-1+"-"+i+"] ;");
				System.out.println("i.e "+(ia[i] + ia[ia.length-1-i] )+" added to ia["+i+"]");
				ia[i]= ia[i] + ia[(ia.length-1)-i] ;

			//	break w;
				//System.out.println("end "+end);
				//
			}//for ends
		}
       //while ends
		
		//check if more than 9 in one char i f yes repeat while
		
		boolean b = Binary.isSingleDigitAray(ia);
		if(b)
		{
			strPercentage =ia[0]+""+ia[1]+"%";
		}
		else
		{
			//create new  tmprry array to check for singlecity
			int iaNew [] = new int [ia.length];
			//copy value fro,ia to tmp array
			for(int p=0;p<ia.length;p++)
			{
				iaNew[p]=ia[p];
			}
			ia = Binary.splitToSigleDigitAray(iaNew);
			
			strPercentage = getPersantage(ia);

		}
	
		
		//returnig ia[]
	
		
		return strPercentage;
	}
	
	public static void main(String[] args) {
	
		System.out.println("enter a size of array ");
		int intSiz = new Scanner(System.in).nextInt();
		int ia[] = new int [intSiz];
		System.out.println("enter "+intSiz+" values to get % ");
		for (int i=0;i<intSiz;i++)
		{
			System.out.println("enter "+i+" value");
			ia[i] = new Scanner(System.in).nextInt();
			
		}
		System.out.println("the elemnts are ");
		for(int i:ia)
			System.out.println(i);
		
		String strPerc = getPersantage(ia);
		
		System.out.println("% is ="+strPerc);
		
	}

}
