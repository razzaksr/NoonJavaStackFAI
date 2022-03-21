package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class Upgrade 
{
	public static void copy(float[] src,int[] dest)
	{
		for(int index=0;index<src.length;index++)
		{
			dest[index]=(int)src[index];
		}
	}
	public static void main(String[] args) 
	{
//		char[] yet= {'Z','E','A','L','O','U','S'};
//		byte[] pet=new byte[yet.length];
		float[] yet= {5.6F,90.4F,12.5F,11.4F,5.6F,10.5F};
		int[] pet=new int[yet.length];
		copy(yet, pet);
		System.out.println(Arrays.toString(pet));
	}
}
