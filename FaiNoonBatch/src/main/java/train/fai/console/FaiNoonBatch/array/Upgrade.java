package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class Upgrade 
{
	public static void copy(char[] src,byte[] dest)
	{
		for(int index=0;index<src.length;index++)
		{
			dest[index]=(byte)src[index];
		}
	}
	public static void main(String[] args) 
	{
		char[] yet= {'Z','E','A','L','O','U','S'};
		byte[] pet=new byte[yet.length];
		copy(yet, pet);
		System.out.println(Arrays.toString(pet));
	}
}
