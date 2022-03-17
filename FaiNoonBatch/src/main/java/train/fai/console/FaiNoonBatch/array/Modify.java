package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;
import java.util.Scanner;

public class Modify 
{
	public static void hellYeah(String[] won)
	{
		Scanner scan=new Scanner(System.in);
		
		for(int pos=0;pos<won.length;pos++)
		{
			System.out.println("Enter the desired tech @ "+pos);
			won[pos]=scan.next();
		}
		
		scan.close();
	}
	public static void main(String[] args) 
	{
		String[] techs=new String[10];
		System.out.println(Arrays.toString(techs));
		hellYeah(techs);
		System.out.println(Arrays.toString(techs));
	}
}
