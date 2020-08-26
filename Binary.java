package logicDesign;



public class Binary {

	public static boolean isSingleDigitAray(int ia[])
	{
		
		for (int i =0;i<ia.length;i++)
		{
			if(ia[i]>9)
				return false;
		}
		return true;
	}
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
	public static void main(String[] args) {
		/*int ia[] ={19,5};
		boolean b = isSingleDigitAray(ia);
		
		System.out.println("ia[] signl dgt is = "+b);
		String str="";
        if(b)
        {
        	 str = Persantage.getPersantage(ia);
        	
        }
        else
        {
		int ia2[] = splitToSigleDigitAray(ia);
		str = Persantage.getPersantage(ia2);
		//System.out.println("");
		//for (int k=0;k<ia2.length;k++)
		///System.out.println("ia2[]"+ia2[k]);
        }
		System.out.println("res = "+str);*/
		
	}

}
