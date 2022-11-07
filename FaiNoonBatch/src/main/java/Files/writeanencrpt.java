package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class writeanencrpt {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\FAIFolder\\faistudent1.txt");
		
		file.createNewFile();
		
		System.out.println(file.getName());
		
		FileOutputStream fos=new FileOutputStream(file);
		
		
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);///encrpt...........
		
		String content="i am manojkumar from namakkal";
		
		dos.write(content.getBytes());
		
		dos.close();
		fos.close();
	}

}
