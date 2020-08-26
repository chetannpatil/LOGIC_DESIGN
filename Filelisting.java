package others;

import java.io.File;

public class Filelisting {

	//1 folder (to hold all CBs)for all run
		private static File folderOfCBs ;
		
		//path whre all cbs to be stored
		private static String pathForCBsStr ;
		//static initializers
		static
		{
			folderOfCBs =  new File("ALL CONTACTBOOKS IN THIS FOLDER");
			//System.out.println(folderOfCBs.exists());
			if(folderOfCBs.exists() == false )
				folderOfCBs.mkdir();
			pathForCBsStr = folderOfCBs.getAbsolutePath()+"/";
			//System.out.println(pathForCBsStr);
		/*	File tempTestFile = new File(pathForCBsStr+"c3.text");
			try {
				tempTestFile.createNewFile();
			} catch (IOException e)
			{
				e.getLocalizedMessage();
				//e.printStackTrace();
			}*/
		}
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub

		File f  = new File(pathForCBsStr);
		//File [] fa = f.listFiles();
		File [] fa  = folderOfCBs.listFiles();
		//folderOfCBs.listFiles();
		//System.out.println("foldr = "+folderOfCBs);
		System.out.println("f = "+fa);
		System.out.println("lng = "+fa.length);
		for(File f1 : fa)
		{
			System.out.println("file = "+f1);
		}
		
		System.out.println("----------------------------------------");
		String [] sa = folderOfCBs.list();
		System.out.println("n ht= "+sa.length);
		for(String str :sa )
			System.out.println("file = "+str);*/
		File fnew = new File("vijay");
		//fnew.mkdir();
		fnew.listFiles();
		System.out.println("f = "+fnew);
		String sa2 [] = fnew.list();
		
		for (int i = 0; i < sa2.length; i++) {
			System.out.println(sa2[i]);
		}
	}

}
