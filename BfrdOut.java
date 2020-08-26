package others;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BfrdOut {

	public static void main(String[] args) throws IOException
	{
		
		System.out.println("enter data");
		DataInputStream di = new DataInputStream(System.in);
		
		//BufferedReader br = di.
				//new BufferedReader(di);
		FileOutputStream fout = new FileOutputStream("java.text",true);	
		
		BufferedOutputStream br = new BufferedOutputStream(fout);
		char ch;
		
		while((   ch  =   (char)di.read()) !='@'  )
			br.write(ch);
		
		br.close();

	}

}
