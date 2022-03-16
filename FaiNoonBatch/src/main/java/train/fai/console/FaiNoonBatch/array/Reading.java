package train.fai.console.FaiNoonBatch.array;

import java.util.Scanner;

public class Reading 
{
	public static void main(String[] args) 
	{
		String[] hof= {"Undertaker","Kane","Batista","Shawn","DX","Scott hall","Stave austin","Edge","Flair","Henry","Gold berg"};
		Scanner scan=new Scanner(System.in);
		
		//System.out.println("Tell us position to get superstar name: ");
		//int pos=scan.nextInt();
		
		//System.out.println("The superstar in the position of "+pos+" is "+hof[pos]);// read
		//System.out.println("The superstar in the position of "+pos+" is "+hof[pos-1]);// read
		
		System.out.println("TEll us the starting phrase wish to get the superstars: ");
		String phrase=scan.next();
		
		for(String point:hof)
		{
			if(point.startsWith(phrase))
				System.out.println(point);
		}
		
		scan.close();
	}
}
