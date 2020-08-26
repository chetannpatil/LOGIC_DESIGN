package others;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DyanamicFolderNFilesForProjects {

	public static void main(String[] args) 
	{
		
		File f1 = new File("tempFolder2");
		
		String path =  f1.getAbsolutePath();
		System.out.println(path);
		if(f1.exists()==false)
		{
			f1.mkdir();
		}
		System.out.println("ENTR FILE NAME");
		String userTextFile = new Scanner(System.in).nextLine();
		File textFile = new File(path+"//"+userTextFile);
		try {
			textFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
