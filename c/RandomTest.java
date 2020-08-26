package c;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
		System.out.println("PLEASE ENTER YOUR NAME ");
		
		Scanner sc = new Scanner(System.in);
		String s4="cg";
		String enterdName = sc.next();
		char testChar;
		int testInt;
		for (int i=0 ;i<enterdName.length();i++) {
			
			testChar = enterdName.charAt(i);
			
			//System.out.println(testChar+ " is char at ith pos");
			testInt = (int)testChar;
			
			//System.out.println(testInt+ " is testint piritive");
			
			//Integer test= (Integer)testInt;
			
			//System.out.println(test + " is test a wraper");
			if ( (testInt>=65 && testInt <=90 ) || (testInt >=97 && testInt <=122))
			{
				
				System.out.println(testChar);
				
				continue;
				
			}
			
			else {
				System.out.println("invliad");
				break;
			}
	  	
		}
		
		System.out.println("you name is "+enterdName);
		//System.out.println("name is "+enterdName);
		
		/*try
		{
			//Integer name = Integer.parseInt(enterdName);
		//if((name instanceof Integer))
			Double d = Double.parseDouble(enterdName);
		if(d instanceof Double)
		System.out.println("yes its an integre");
		
		}
		catch(NumberFormatException n)
		{
			System.out.println("no,its a string");
		}
		finally
		{
			System.out.println("");
		}
		*/
		
		/*int x,a= 7;
		//x=Integer.parseInt(Math.random().t)*a;
		
		x= (int) (a*Math.random())hgh;
		
		System.out.println(x);*/
		/*int x=10;
		
		//x=(int)(Math.random()*x);
		
		//System.out.println(Math.random());
		System.out.println(x);
	switch (x) {
	case 0:
		System.out.println("Love your job,Not your company ");
		break;
	case 1:
		System.out.println("Never read other's quotes,Be yourself");
		break;
	case 2:
		System.out.println("Knoweledge is Power");
		break;
	case 3:
		System.out.println("There is nothing worser than attending own GF's wedding");
		break;
	case 4:
		System.out.println("Be happy for No reason, You will be happy for ever");
		break;
	case 5:
		System.out.println("Never regret for any decesion taken by you in life even if you are solely resposible for it");
		break;
	case 6:
		System.out.println("Greate God Grant me Twice Two Not Be Four");
		break;
	case 7:
		System.out.println("Living once in life make me happy for ever");
		break;
	case 8:
		System.out.println("Do you know ,why are you looking for other's quotes?.Beacuse you are hopelessfellow & you dont have any work");
		break;
	case 9:
		System.out.println("The person reading this quote will die in a weekdays");
		break;
	default:
		System.out.println("default");
		break;*/
	//}
			
	}

}
