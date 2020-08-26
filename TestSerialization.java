package others;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		
		//Person p2 = new Person("ghantavva", 36);
		File f = new File("deepa");
	/*	try {
			//f.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(p2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		System.out.println(f.getAbsolutePath());
		
		ObjectInputStream ois;
		try {
			
			ois = new ObjectInputStream(new FileInputStream(f));
			
			Person pRead = (Person)ois.readObject();
			System.out.println("person1 = "+pRead);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
