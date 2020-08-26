package batch81lab;

public class ConcatStrings {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "";
		for(int i =0 ;i<args.length;i++)
			str = str + args[i];
		
		System.out.println(str);

	}

}
