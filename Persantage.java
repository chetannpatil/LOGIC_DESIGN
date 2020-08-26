package logicDesign;

public class Persantage {

	public static void main(String a[])
	{
		
	}
	public static String strPercentage;
	//public static StringBuilder sb ;
	public static int end;
	public static String getPersantage(int ia[])
	{
	
	end =ia.length-1;
		
		//System.out.println("end "+end);
	w:	while(end >= 2)
		{
			//System.out.println("insie while at end "+end);
		 enLop:	for (int i = 0;i<end;i++)
			{
			/// System.out.println("_______________________________________________");
			// System.out.println("inside for i= "+i);
				if(   i >  (end-i))
				{
					//System.out.println(i+" > end-i "+(end-i));
					end = (i-1);
					 System.out.println("");
					 System.out.print("");
					for(int p=0;p<=end;p++)
					{
						System.out.print(ia[p]+" ");
					}
					continue w;
				/*	//create new  tmprry array to check for singlecity
					int iaNew [] = new int [end+1];
				
					
					//copy value fro,ia to tmp array
					for(int p=0;p<=end;p++)
					{
						iaNew[p]=ia[p];
					}
					//checking sinle digit elm all ?
					boolean b = Binary.isSingleDigitAray(iaNew);
					if(b)
					{
						continue w;
					}
					else
					{
						ia = Binary.splitToSigleDigitAray(iaNew);
						continue w;
					}*/
					
					
					
				}
				if(   i == (end-i)  )
				{
				//	System.out.println(" {i== end-i} i.e ("+end+"-"+i+") = "+(end-i));
				//	System.out.println("ia["+i+"] ="+ia[i]);
					//ia[i] = 
					end = i ;
					 System.out.println("");
					 System.out.print("");
					for(int p=0;p<=end;p++)
						System.out.print(ia[p]+" ");
					continue w;
				/*	
					//create new  tmprry array to check for singlecity
					int iaNew [] = new int [end+1];
					//copy value from ,ia to tmp array
					for(int p=0;p<=end;p++)
					{
						iaNew[p]=ia[p];
					}
					
					boolean b = Binary.isSingleDigitAray(iaNew);
					if(b)
					{
						continue w;
					}
					else
					{
						ia = Binary.splitToSigleDigitAray(iaNew);
						continue w;
					}*/
				}
			//	System.out.println("ia["+i+"]= ia["+i+"] + ia["+end+"-"+i+"] ;");
			//	System.out.println("i.e "+(ia[i] + ia[end-i] )+" added to ia["+i+"]");
				ia[i]= ia[i] + ia[end-i] ;
				
				
				
			//	
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
			int iaNew [] = new int [end+1];
			//copy value fro,ia to tmp array
			for(int p=0;p<=end;p++)
			{
				iaNew[p]=ia[p];
			}
			ia = Binary.splitToSigleDigitAray(iaNew);
			
			strPercentage = getPersantage(ia);

		}
	
		
		//returnig ia[]
	
		
		return strPercentage;
	}


}
