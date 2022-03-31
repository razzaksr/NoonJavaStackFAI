package train.fai.console.FaiNoonBatch.collections;

import java.util.Stack;

public class StkNonGen 
{
	public static void main(String[] args) 
	{
		Stack<Float> dem=new Stack<Float>();
		dem.push(3.1F);dem.push(9.1F);dem.push(3.1F);dem.push(56.3F);dem.push(45.1F);
		dem.push(3.1F);dem.push(78.1F);dem.push(34.5F);dem.push(8.4F);dem.push(12.1F);
		
		System.out.println(dem);
	}
}
