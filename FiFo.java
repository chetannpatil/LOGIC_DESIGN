package others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FiFo {

	public static void main(String[] args) throws IOException {
		
		//Reader ;
		FileInputStream fin=null ;
		//FileReader fin = null;
		//FileWriter fio = null;
		FileOutputStream fio=null;
		BufferedOutputStream bout = null; BufferedInputStream bin = null;
		//bffrdraeder
		//BufferedReader br = null;
		//BufferedWriter bw = null;
		
		try {
			
		//Reader= new Reader("java.text");
			fin = new FileInputStream("buzy android ville.text");
		 fio = new FileOutputStream("570.text",true);
		 
		// br = new BufferedReader(fin);
		// bw = new BufferedWriter(bw);
		 bin = new BufferedInputStream(fin);
		 bout = new BufferedOutputStream(fio);
			int end;
			String endLine;
			// while((end=bin.read()) != -1)
			while(   (end=bin.read()) !=  -1 ) 
			 {
				
				
				System.out.println(end);
				//bw.write(endLine);
		/*		 System.out.println("end"+end);
				 System.out.println((byte)end);
				 System.out.println((char)end);*/
				 
				 //fio.write((byte)end);
				 bout.write(end);
			 }
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException n)
		{
			n.printStackTrace();
			n.getMessage();
			n.getLocalizedMessage();
			n.getCause();
			//System.out.println(n);
		}
      finally
      {
    	  bout.close();
    	 // try {
			//fin.close();
			//br.close();
			//bw.close();
			// fio.close();
		/*	 bin.close();
			 bout.close();*/
	//	} //catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	//	}
			
      }
		
	}

}
