package train.fai.console.FaiNoonBatch.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 
 syntax:
 type[] iden={v1,v2,.....};
 type iden[]={v1,v2,.....};
 
 type[] iden=new type[size];
 type iden[]=new type[size];
 
 types:
 single
 multi
 jagged
 
 datatypes: int(4),short(2),long(8),double(8),float(4),byte(1),boolean,char
 wrapper classes: Integer,Short,Long,Double,Float,Byte,Boolean,Character
 
 */

public class NewOnes
{
	public static void main(String[] args) 
	{
		Double[] mileage=new Double[5];
		System.out.println(Arrays.toString(mileage));
		Scanner scan=new Scanner(System.in);
		
//		for(Double element:mileage)
//		{
//			System.out.println("Enter the mileage of your car: ");
//			element=scan.nextDouble();
//			System.out.println("Entered mileage is: "+element);
//		}
		for(int index=0;index<mileage.length;index++)
		{
			System.out.println("Enter the mileage of your car: ");
			mileage[index]=scan.nextDouble();
			System.out.println("Entered mileage is: "+mileage[index]);
		}
		
		System.out.println(Arrays.toString(mileage));
		
		scan.close();
	}
}
