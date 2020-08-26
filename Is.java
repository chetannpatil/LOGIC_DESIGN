package others;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Is {

	public static void main(String[] args) throws IOException {
	
		System.out.println("enter data");
		DataInputStream di = new DataInputStream(System.in);
		
		//BufferedReader br = di.
				//new BufferedReader(di);
		FileOutputStream fout = new FileOutputStream("buzy coders android ville.text",true);
		
	//	char ch=(char) di.read();;

	int i= di.read();
		
		
		System.out.println(String.valueOf(i));
		//fout.write(str);
		
		/*do
		{
			ch = (char)di.read();
			fout.write(ch);
		
		}
		while(ch!='@')	;*/		
		//
			
		fout.close();
		di.close();
	}

}
