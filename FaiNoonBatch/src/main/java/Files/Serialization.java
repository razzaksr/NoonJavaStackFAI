package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		File file=new File("E:\\FAIFolder\\Serializable.txt");
//		file.createNewFile();
//		System.out.println(file.getName());
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Phone p1=(Phone)ois.readObject();
		System.out.println(p1.Mobilename+" "+p1.Model+" "+p1.Ram+" "+p1.price+" ");
		ois.close();
		fis.close();
		
		
//		FileOutputStream fos=new FileOutputStream(file);
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		
//		Phone p1=new Phone();
//		p1.Mobilename="Oppo";
//		p1.Model="Realme7";
//		p1.Ram=4;
//		p1.price=23000;
//		
//		oos.writeObject(p1);
//		System.out.println(oos);
//		fos.close();
//		oos.close();
	}

}


class Phone implements Serializable
{
	String Mobilename;
	String Model;
	int Ram,price;
	
	
	
}