package myString;

public class TestSB {

	public static void main(String[] args) 
	{
		
		StringBuilder sb = new StringBuilder();
		sb.append("gp");
		sb.append('\n');
		sb.append("CHETAN");
		String str = sb.toString();
		System.out.println(sb);
		System.out.println("str = "+str.length());
		System.out.println(str);
		
		String [] sa = str.split("\n");
		System.out.println("sa lnth = "+sa.length);
		System.out.println("sa0 "+sa[0]);
		System.out.println("sa1 = "+sa[1]);
		for(String s1 : sa)
		System.out.println(s1);

	}

}
