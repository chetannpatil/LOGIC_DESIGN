package others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilInptstr {

	public static void main(String[] args) throws IOException {
		System.out.println("enter data");
		FileInputStream fis = new FileInputStream("buzy coders android ville.text");
		
		
		int ch;
		//=(char)fis.read();
while(  (ch =fis.read()) !=-1 )
		{
			 
			System.out.print((char)ch);
			
		
		}
		
		
		
		
	}

}
