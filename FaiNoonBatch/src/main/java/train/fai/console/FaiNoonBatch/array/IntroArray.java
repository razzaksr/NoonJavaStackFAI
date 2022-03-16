package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class IntroArray 
{
	public static void main(String[] args) 
	{
		String[] alpha= {"Martin","Decaprio","Hiddleston","Holland","Cruise","Brando","Jackman","Statham","RDJ"};
		System.out.println(alpha.length);
		//System.out.println(alpha);
//		for(int base=0;base<alpha.length;base++)
//		{
//			System.out.println(alpha[base]);
//		}
		
		//System.out.println(Arrays.toString(alpha));
		
		for(String anu:alpha)
		{
			System.out.println(anu);
		}
		
	}
}
