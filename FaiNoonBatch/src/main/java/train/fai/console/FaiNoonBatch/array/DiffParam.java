package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;

public class DiffParam 
{
	public static void shell(double hey)
	{
		//System.out.println(hai);
		System.out.println("Shell showing the value "+hey);
	}
	public static void doomsDay(double yet)
	{
		System.out.println(yet+" is what doomsday received");
		yet*=2;
		System.out.println(yet+" is now @ doomsday");
	}
	
	public static void lexLuther(double[] cat)
	{
		System.out.println(Arrays.toString(cat)+" is what lex received");
		cat[2]*=2;
		System.out.println(Arrays.toString(cat)+" is what lex modified");
	}
	
	public static void main(String[] args) 
	{
		double hai=9.23;
		System.out.println(hai);
		shell(12.4);
		shell(hai);
		
		doomsDay(hai);
		System.out.println(hai+" after doomsday");
		
		double[] wanda= {9.1,7.8,3.4,12.8,7.4,99.2,1.9};
		doomsDay(wanda[4]);
		System.out.println(wanda[4]+" after doomsday");
		
		System.out.println("In main, Before to lex "+Arrays.toString(wanda));
		lexLuther(wanda);
		System.out.println("In main, After to lex "+Arrays.toString(wanda));
	}
}
