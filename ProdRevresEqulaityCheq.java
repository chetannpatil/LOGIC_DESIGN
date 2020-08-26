package iQ;

import java.util.Scanner;

public class ProdRevresEqulaityCheq {

	private static boolean isRevOfProdAreEqual(int n)
	{
		int squreInt = (n * n);
		StringBuilder sbN = new StringBuilder(n+"");
		
		StringBuilder sbSqure = new StringBuilder(squreInt+"");
		//now 
		int reverInt = Integer.parseInt(sbN.reverse().toString().trim());
		int squreRevrs = (reverInt * reverInt);
		StringBuilder sbRevrSqure = new StringBuilder(squreRevrs+"");
		if(sbSqure.toString().equals(sbRevrSqure.reverse().toString()) == true )
			return true ;
		else
			return false ;
	}
	public static void main(String[] args) {
	System.out.println("ENETER A NUMBER");
	int x = new Scanner(System.in).nextInt() ;
	System.out.println("enter d = "+x);
	System.out.println(x+"'s squre N its revres squre are qula =  "+isRevOfProdAreEqual(x));

	}

}
