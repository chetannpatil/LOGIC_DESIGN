package myString;

public class Equality {

	public static void main(String[] args) {
		
		
		String s1 ="mamataChetan",s6="chetan";
		String s2 ="Chetan";
		String s3 = new String("mamata");
		String s4 = new String("mamata");
		
	/*	System.out.println(s1.endsWith(s2));
		
		System.out.println(s1.startsWith("ma"));*/
		
		System.out.println(s1.startsWith(s2, 6));
		
		//System.out.println(s1<s6);
/*		System.out.println("== check");
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));
		System.out.println("s3==s4 "+(s3==s4));
		
		System.out.println(" .equlal() check");
		System.out.println("(s1.equals(s2)"+(s1.equals(s2)));
		System.out.println("(s1.equals(s3)"+(s1.equals(s3)));
		System.out.println("(s3.equals(s4)"+(s3.equals(s4)));*/
	}

}
