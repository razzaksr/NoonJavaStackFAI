package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;


public class EncrptAnRead {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\FAIFolder\\faistudent1.txt");
		
		FileInputStream fis=new FileInputStream(file);
		
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		int size=fis.available();
		byte[] temp=new byte[size];
		
		iis.read(temp);
		
		System.out.println(new String(temp));
//		String data=new String(temp);
//		
//		System.out.println(file.getName()+" following contents are \n "+data);
//		
		fis.close();
		iis.close();
		
		
	}

}
