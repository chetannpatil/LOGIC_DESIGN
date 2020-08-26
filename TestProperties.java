package others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null,fr1=null;
		FileWriter fw=null, fw1 =null;
		BufferedReader br = null,br1= null;
		BufferedWriter bw = null, bw1 = null;
		
		Properties p2 = new Properties();
		p2.put("key", 1);
		p2.put("key1", 21);
		p2.put("key2", 41);
		System.out.println(p2);
	Properties p = new Properties();
	Properties p1 = new Properties();
		try {
		
			 fr = new FileReader("chetan.text");
			 fr1 = new FileReader("kavya.text");
			
			 br = new BufferedReader(fr);
			 br1 = new BufferedReader(fr1);
			 
			 
			 fw1 = new FileWriter("new_multi.text");
			 fw = new FileWriter("loadToStore.text");
			 bw = new BufferedWriter(fw);
			 
			 bw1  = new BufferedWriter(fw1);
			 p.load(br);
			 p1.load(br1);
			 String nxt ;
					System.out.println(p);
					System.out.println(p1);
			/* for(Object o : p1.entrySet())
			 {
			    System.out.println(o);	 
			 }*/
		
				 p.store(bw, "comments: chetan ");
				 p1.store(bw1, "multi vles baruta?");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("hi");
		}
catch (IOException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		finally{
		/*	fr.close();
			fr1.close();
			fw.close();*/
			
		}
	

	}

}
