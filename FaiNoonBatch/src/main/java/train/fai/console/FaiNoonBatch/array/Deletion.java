package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class Deletion 
{
	public static void perform(Object[] great)
	{
		for(Object t:great)
		{
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		String[] hai= {"Javascript","Python","Razor","SpringBoot","DJango"};
		//hai[2]=null;
		Integer[] yet= {12,45,765,24,68,42,1,6};
		yet[3]=0;
		Deletion.perform(hai);Deletion.perform(yet);
		//System.out.println(Arrays.toString(hai));
		//System.out.println(Arrays.toString(yet));
		for(int index=0;index<hai.length;index++)
		{
			if(hai[index].contains("o"))
			{
				hai[index]=null;
			}
		}
		Deletion.perform(hai);
	}
}
