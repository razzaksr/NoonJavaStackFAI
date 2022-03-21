package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class DifferentSize
{
	public static void main(String[] args) 
	{
		double[] queen= {12.5,9.2,4.5,14.5,4.4,8.1,9.2};
		int[] freak=new int[3];
		
		for(int index=0;index<freak.length;index++)
		{
			freak[index]=(int)queen[index];
		}
		System.out.println(Arrays.toString(freak));
		
		//freak=(int[])Arrays.copyOfRange(queen, 0, 3);
		
		double[] harly=new double[queen.length];
		harly=Arrays.copyOfRange(queen, 0, harly.length);
		System.out.println(Arrays.toString(harly));
	}
}
