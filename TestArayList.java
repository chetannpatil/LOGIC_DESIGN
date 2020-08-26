package others;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestArayList {

	public static void main(String[] args) {
	
		//  col2 = new ArrayList();
		Collection col = new HashSet();
		
		ArrayList al = new ArrayList();
		Person p1 ;
		
Scanner sc = new Scanner(System.in);
String name,phn;
int pos =0;
		
		int ch=0;
		while(ch!=5)
		{
			System.out.println("selec any 1 form below ");
			System.out.println("1.add");
			System.out.println("2.display");
			System.out.println("3.search ");
			System.out.println("4.get hashcode");
			System.out.println("5. exit");
			
			while(!sc.hasNextInt())
			{
				System.out.println("entr only numbers pls");
				sc.next();
			}
			ch =sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("adding netr name of person");
				name = sc.next();
				  //   System.out.println("enter phn nmbr for "+name); b
			     //  phn = sc.next();     
			    //   p1 = new Person(name,phn);
			      
			     //  System.out.println("adding person "+ al.put(p1, value)(p1));
			       
			       
				//System.out.println(al.add(243324)+" int");
			
				System.out.println("");
			//System.out.println(al.add(243324)+" int");
			      // name = sc.next();
			   //    System.out.println(al.add("name"));
			  
			    
			    /*   System.out.println(al.add("name"));
			       System.out.println(al.add(23782738));
			       System.out.println(al.add(true));
			       System.out.println(al.add(3722.31231));*/
			        
				break;
			
			case 2:
				System.out.println("conTETNS ARE");
			    System.out.println(al);
			 //    System.out.println(col);
			        
			/*for (Object object : col) {
				//if(object instanceof Person)
				Person	 p2 = (Person)object;
				System.out.println(p2.name);
				System.out.println(p2.phn);
			}       */
			
				break;
			
			case 3:System.out.println("serching");
			System.out.println("enter name to search ");
			name = sc.next();
			
			System.out.println("enter phone of "+name);
			phn = sc.next();
			
	//       p1 = new Person(name,phn);
			pos=col.size();
			
			if(col.isEmpty())
			{
				System.out.println("not there soorrry");
			}
	//		if(col.contains(p1))
		//		System.out.println("yes "+p1+" exist");
		//	else
		//		System.out.println(p1+" not there ");		
	

				break;
			
			case 4 :
				    System.out.println("enter nam ");
				    name = sc.next();
				    System.out.println("enter phn ");
				    phn = sc.next();
	//			    p1 = new Person(name, phn);
	//			    if(col.contains(p1))
				//    System.out.println("hascd of "+p1 +" is "+p1.hashCode());
		//		    else
				    	System.out.println("not there");
				    break;
			case 5:System.out.println("good bye");
				break;
				
				

			default:System.out.println("numr ranfgre 1 to 4");
			//col.sort(col);
				break;
			}
			
			
		}
			
			
		

	}

}
