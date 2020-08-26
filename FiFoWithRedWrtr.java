package others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiFoWithRedWrtr {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw  = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try
		{
			fr = new FileReader("buzy coders android ville.text");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("zeera.text",true);
			bw = new BufferedWriter(fw);
			String endLine;
			while(   (endLine=br.readLine()) !=  null ) 
			 {
				System.out.println(endLine);
				bw.write(endLine);
				//bw.write((char)endLine);
				bw.newLine();
				//bw.close();
			 }
		}
catch (FileNotFoundException e) {
			
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
			try
			{
				bw.close();
				br.close();
				//fr.close();
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}

	}

}
