package colections;

import java.util.LinkedList;
import java.util.Scanner;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;

public class LnkedList {

	public static void main(String[] args) {
		int choice=0;
		LinkedList<String> ls = new LinkedList<String>();
		while(choice!=7)
		{
		System.out.println("the opertions on linkedlist are ");
		System.out.println("1.add");
		System.out.println("2.delete");
		System.out.println("3.display");
		System.out.println("4.replace");
		System.out.println("5.get index of object");
		System.out.println("6.know SIzE OF LL");
		System.out.println("7.exit");
		System.out.println("enter ur choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		//sc.close();
		switch (choice)
		{
		case 1:
			
			int addChoice =0;
			while(addChoice!=4)
			{
				System.out.println();
				System.out.println("the options in addition are ");
				System.out.println("1.add at first postin");
				System.out.println("2.add at last postin");
				System.out.println("3.add at  postin of ur choice");
				System.out.println("4.exit from the additon window");
				addChoice =sc.nextInt();
				
				switch (addChoice) {
				case 1:
					    String strAddFirst;
					    System.out.println("adding at first postion");
				        System.out.println("eneter element to be addede at first postion");				        
				        strAddFirst=sc.next();
				        ls.addFirst(strAddFirst);
					
					break;
                case 2:
                	String strAddLast;
                	System.out.println(".adding at last postin");
                	System.out.println("eneter element to be addede at last postion");
					strAddLast = sc.next();
					ls.addLast(strAddLast);
					
					break;
                case 3:
                	int intAddPos;
                	String strAddPos;
                	System.out.println("adding at  postin of ur choice");
                	System.out.println("eneter position (wher d u wann add?)");
                	intAddPos=sc.nextInt();
                	System.out.println("eneter element to be addede at the "+intAddPos+" position");
                	strAddPos = sc.next();
                	ls.add(intAddPos, strAddPos);
					
					break;
              case 4:
            	  System.out.println("exited from additon window");
            	  break;

				default:
					System.out.println("wronf choice pls enter number only avalible in options pls");
					break;
				}
			}
			
			break;
        
		case 2:
			int deletChoice=0;
			while(deletChoice!=8)
			{
				
				System.out.println("the options in deletion are ");
				System.out.println("1.delete at first postin");
				System.out.println("2.delete at last postin");
				System.out.println("3.delete at  postin of ur choice");
				System.out.println("4 delete the object of ur choic frm linkedlist if it exist");
				System.out.println("5.delete the first occcrnce of object of ur choic frm linkedlist ");
				System.out.println("6.delete the last occcrnce of object of ur choic frm linkedlist ");
				System.out.println("7.delete all eleemnts from LL ?");
				System.out.println("8.exit from the deletion window ?");
				deletChoice = sc.nextInt();
				switch (deletChoice) {
				case 1:
					
					System.out.println("deleting element from first postion");			
					System.out.println(ls.removeFirst()+" was at first pos of LL & been truncated :(");
					break;
                   case 2:
                	   System.out.println(".deleting elelmnt from last postin");
                	   System.out.println(ls.removeLast()+ " was at last pos of LL & been truncated :(");
                	   break;
					
                   case 3:
                	   int delePos;
                	   System.out.println(".deleting at  postin of ur choice");
                       System.out.println("enetr postion to delet elemt");   
                       delePos = sc.nextInt();
                       System.out.println(ls.remove(delePos)+ " was at pos "+delePos+" of LL & been truncated :(");
                	   break;
                   case 4:
                	   String deleObj;
                	   System.out.println("delete the object of ur choic frm linkedlist if it exist");
                	   System.out.println("enetr object if u know to delet from LL");
                	   deleObj=sc.next();
                	   System.out.println("the removal of the object "+deleObj+" scceccds is "+ls.remove(deleObj));
                	   
                	   break;
                   case 5:
                	   String deleObFirstOccr;
                	   System.out.println("delete the first occcrnce of object of ur choic frm linkedlist ");
                	   System.out.println("enetr object if u know to delet fisrt occcrce of it  from LL");
                	   deleObFirstOccr = sc.next();
                	   System.out.println("the removal of the first occrnc f object"
                	   		+ " "+deleObFirstOccr+" scceccds is "+ls.removeFirstOccurrence(deleObFirstOccr));
                	   break;
                   case 6:
                	   String deleObjLastoccr;
                	   System.out.println(".delete the last occcrnce of object of ur choic frm linkedlist ");
                	   System.out.println("enetr object if u know to delet last occcrce of it  from LL");
                	   deleObjLastoccr = sc.next();
                	   System.out.println("the removal of the last occrnc f object"
                   	   		+ " "+deleObjLastoccr+" scceccds is "+ls.removeLastOccurrence(deleObjLastoccr));
                	   break;
                	   case 7:
                		    String deleAll;
                			System.out.println(".delete all eleemnts from LL ?");
                			System.out.println("d u really want delete all elemt fr LL,eneter yes/no (case insensitive) ?");
                			deleAll = sc.next();
                			if(deleAll.equalsIgnoreCase("yes"))
                			{
                				ls.clear();
                				System.out.println("everytig deleted ");
                				break;
                			}
                			else {
                				 break; 
							}
                		case 8:
                			  System.err.println("exited from deletionwindow");
                			  break;
             	default:
             		 System.err.println("wrong choice pls enetr nubers only availb in optins ");
					break;
				}
			}
			break;
		case 3:			
			int dispChoice;
			System.out.println("the options in display are ");
			System.out.println("1.display element at first postin");
			System.out.println("2.display element at last postin");
			System.out.println("3.display element at  postin of ur choice");
			System.out.println("4.exit the dipslya  window");
			dispChoice = sc.nextInt();
			switch (dispChoice) {
			case 1:
				System.out.println(".display element at first postin");
				System.out.println("the eelemnt at fisrt pos is "+ls.getFirst());
				break;
            case 2:
            	System.out.println(".display element at last postin");
            	System.out.println("the eelemnt at last  pos is "+ls.getLast());
				break;
            case 3:
            	int dispPos;
            	System.out.println(".display element at  postin of ur choice");
            	System.out.println("enter pos to get elemnt");
            	dispPos = sc.nextInt();
            	System.out.println("the eelemnt at pos" +dispPos+" is "+ls.get(dispPos));
	
        	break;
        	case 4:
        		  System.err.println("exited from  display window");
        		  break;

			default:
				 System.err.println("wrong choice pls enetr nubers only availb in optins ");
				break;
			}
			break;
		case 4:
			int replcPos;
			String strReplc;
			
			System.out.println("REPLCING");
			System.out.println("eneter the pos of elemt where u want replce");
			replcPos = sc.nextInt();
			System.out.println("enetr  eelemnt which u want add at "+replcPos+" posiotn pls");
			strReplc= sc.next();
			System.out.println("the replced elemnt is "+ls.set(replcPos, strReplc));
			
			  System.err.println("exited from replacing  window");
			break;
		case 5:
			int indxChoice ;
			System.out.println("get index of");
			System.out.println("the opton in getIndex are ");
			System.out.println("1.the index of first occrnce of objct u eneterd");
			System.out.println("2.the index of last occrnce of objct u eneterd");
			System.out.println("3 exit from getindex window");
			indxChoice = sc.nextInt();
			switch (indxChoice) {
			case 1:
				String strIndxFirstOccr;
				System.out.println("the index of first occrnce of objct u eneterd");
				System.out.println("enter the objct to search fisrt occnr of it");
				strIndxFirstOccr = sc.next();
				System.out.println("the index of first occrnce of objct u eneterd is "+ls.indexOf(strIndxFirstOccr));
				break;
			case 2:
				String strIndxLastOccr;
				System.out.println("the index of last occrnce of objct u eneterd");
				System.out.println("enter the objct to search last occnr of it");
				strIndxLastOccr = sc.next();
				System.out.println("the index of first occrnce of objct u eneterd is "+ls.lastIndexOf(strIndxLastOccr));
				
				break;
				case 3:
					  System.err.println("exited from getIndex window");
					  break;
			
			default:
				 System.err.println("wrong choice pls enetr nubers only availb in optins ");
				break;
			}
			break;
		case 6:
			String strSize;
			System.out.println("wann know size of ur LL?");
			System.out.println("enter yes/no (case insenseintive)");
			strSize = sc.next();
			if(strSize.equalsIgnoreCase("yes"))
			{
				System.out.println("the size of ur LL is "+ls.size());
				  System.err.println("exited from  size window");
				break;
			}
			
			else 
				System.err.println("exited from  size window");
			
			break;
			
			
		case 7:
			System.err.println("exited from  MAIN window & good bye & re-RUN to Restart LL");
			break;
		default:
	       System.err.println("wrong choice pls enetr nubers only availb in optins ");
			break;
		}
		}
		

	}

}
