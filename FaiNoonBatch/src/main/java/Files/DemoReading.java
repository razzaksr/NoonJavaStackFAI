package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoReading {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\FAIFolder\\faistudent.txt");
		
		FileInputStream fis=new FileInputStream(file);//reading
		
//		int size=fis.available()
//		byte[] temp=new byte[size];	
//		fis.read(temp);
//		String data=new String(temp);
//		System.out.println(data);
		
		
		int asci=0;
		while((asci=fis.read())!=-1)
		{
			System.out.print((char)asci);//typecasting
		}
		
	
		fis.close();
		
		
		
		
		
		
		
	}

}
