package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;
import java.util.Scanner;

public class Update 
{
	static Scanner scan=new Scanner(System.in);
	public static void upOne(String[] term,int pos)
	{
		System.out.println("Tell us artist to update @ "+pos);
		term[pos]=scan.next();
	}
	public static void upCondition(String[] third,String match)
	{
		for(int index=0;index<third.length;index++)
		{
			if(third[index].contains(match))
			{
				System.out.println("Tell us new artist instead of "+third[index]);
				third[index]=scan.next();
			}
		}
	}
	public static void main(String[] args) 
	{
		String[] fav= {"Ilayaraja","Rahman","Yuvan","GVP","Unni menon","Yesudas"};
		//Update.upOne(fav, 5);
		Update.upCondition(fav, "an");
		System.out.println(Arrays.toString(fav));
	}
}
