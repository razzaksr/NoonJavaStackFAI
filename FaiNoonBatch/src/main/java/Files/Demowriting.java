package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demowriting {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\FAIFolder\\faistudent.txt");
		
//		file.mkdir();//folder creation
//		file.createNewFile();//file creation
//		System.out.println(file.getName());
		
		FileOutputStream fos=new FileOutputStream(file);//write
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please type a content inside a file");
		String words=scan.nextLine();
		
		
		fos.write(words.getBytes());//write a code is added
		
		System.out.println(file.getName() +" file is successfully written");
		
		
		fos.close();
		
		
		
		
		
	}

}
